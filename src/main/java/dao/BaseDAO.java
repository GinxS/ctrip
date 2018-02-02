package dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import util.DBHelper;

public class BaseDAO<T> {
	//查询通用方法
	public List<T> Query(String sql,Object[] params,Class clazz){
		List<T> list = new ArrayList<T>();
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conn = DBHelper.getConn();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			rs = ps.executeQuery();
			//获取rs里面的数据
			ResultSetMetaData data = rs.getMetaData();
			//获取类的数量
			int count = data.getColumnCount();
			while(rs.next()){
				T t = (T) clazz.newInstance();
				for (int i = 0; i < count; i++) {
					//获取列名(实体类属性名)
					String column = data.getColumnName(i+1);
					//拼接set方法名
					String methodName = "set"+column.substring(0, 1).toUpperCase()+column.substring(1);
					//获取属性
					Field field = clazz.getDeclaredField(column);
					//创建方法
					Method method = clazz.getMethod(methodName, field.getType());
					//执行方法
					method.invoke(t, rs.getObject(column));

				}
				list.add(t);
			}

		} catch (Exception e) {
		}finally{
			DBHelper.closeAll(rs, ps, conn);
		}

		return list;
	}

	public T getOnly(String sql,Object[] params,Class clazz){
		T t = null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conn = DBHelper.getConn();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			rs = ps.executeQuery();
			//获取rs里面的数据
			ResultSetMetaData data = rs.getMetaData();
			//获取类的数量
			int count = data.getColumnCount();
			if(rs.next()){
				t = (T) clazz.newInstance();
				for (int i = 0; i < count; i++) {
					//获取列名(实体类属性名)
					String column = data.getColumnName(i+1);
					//拼接set方法名
					String methodName = "set"+column.substring(0, 1).toUpperCase()+column.substring(1);
					//获取属性
					Field field = clazz.getDeclaredField(column);
					//创建方法
					Method method = clazz.getMethod(methodName, field.getType());
					//执行方法
					method.invoke(t, rs.getObject(column));
				}
			}
		} catch (Exception e) {
		}finally{
			DBHelper.closeAll(rs, ps, conn);
		}
		return t;
	}

	public void update(String sql,Object[] params, Connection conn){
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			ps.executeUpdate();
		} catch (Exception e) {
		}finally{
			DBHelper.closeAll(null, ps, null);
		}
	}
}
