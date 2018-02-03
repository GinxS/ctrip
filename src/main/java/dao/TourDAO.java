package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pojo.Comment;
import pojo.Company;
import pojo.Tour;
import pojo.TourDate;
import pojo.TourFee;
import pojo.TourImage;
import pojo.TourInfo;
import pojo.TourRoute;
import pojo.TourRule;
import util.DBHelper;
import util.PageUtil;

public class TourDAO extends BaseDAO{
	//查找旅游商品
	public void searchTour(String tour_name,PageUtil<Tour> pageUtil){
		String sql = "select * "
				+ " from tour t,(select tour_id,avg(level) from `comment` group by tour_id) a,company c "
				+ " where t.tour_id=a.tour_id and t.tour_company=c.company_id and t.tour_title like concat('%',?,'%')"
				+ " limit ?,?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Tour> list = pageUtil.list;
		try {
			conn = DBHelper.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, tour_name);
			ps.setInt(2, (pageUtil.index-1)*pageUtil.size);
			ps.setInt(3, pageUtil.size);
			rs = ps.executeQuery();
			while(rs.next()){
				Tour tour = new Tour();
				tour.setTour_id(rs.getInt("tour_id"));
				tour.setTour_name(rs.getString("tour_title"));
				tour.setTour_price(rs.getInt("tour_price"));
				tour.setRecommend(rs.getString("recommend"));
				tour.setTour_image(rs.getString("tour_image"));
				tour.setTour_level(rs.getInt("avg(level)"));
				Company company = new Company();
				company.setCompany_id(rs.getInt("company_id"));
				company.setCompany_name(rs.getString("company_name"));
				tour.setTour_company(company);
				list.add(tour);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//查看单个商品详细信息
	public Tour getTour(Integer tour_id){
		String sql = "select * "
				+ " from tour t,(select tour_id,avg(level) from comment group by tour_id) a,company c "
				+ " where t.tour_id=a.tour_id and t.tour_company=c.company_id and t.tour_id=? ";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Tour tour = new Tour();
		try {
			conn = DBHelper.getConn();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, tour_id);
			rs = ps.executeQuery();
			if(rs.next()){
				tour.setTour_id(rs.getInt("tour_id"));
				tour.setTour_name(rs.getString("tour_title"));
				tour.setTour_price(rs.getInt("tour_price"));
				tour.setRecommend(rs.getString("recommend"));
				tour.setTour_image(rs.getString("tour_image"));
				tour.setTour_level(rs.getInt("avg(level)"));
				Company company = new Company();
				company.setCompany_id(rs.getInt("company_id"));
				company.setCompany_name(rs.getString("company_name"));
				tour.setTour_company(company);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tour;
	}
	
	//查看商品图片列表
	public List<TourImage> getTourImage(Integer tour_id){
		String sql = "select * from tour_image where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourImage.class);
	}
	//查看商品行程列表
	public List<TourDate> getTourDate(Integer tour_id){
		String sql = "select * from tour_date where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourDate.class);
	}
	//查看商品介绍列表
	public List<TourInfo> getTourInfo(Integer tour_id){
		String sql = "select * from tour_info where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourInfo.class);
	}
	//查看商品行程计划列表
	public List<TourRoute> getTourRoute(Integer tour_id){
		String sql = "select * from tour_route where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourRoute.class);
	}
	//查看商品费用介绍列表
	public List<TourFee> getTourFee(Integer tour_id){
		String sql = "select * from tour_fee where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourFee.class);
	}
	//查看商品预定须知列表
	public List<TourRule> getTourRule(Integer tour_id){
		String sql = "select * from tour_rule where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourRule.class);
	}
	//查看商品评论
	public List<Comment> getComment(Integer tour_id){
		String sql = "select * from comment where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},Comment.class);
	}
	
	public static void main(String[] args) {
		TourDAO dao = new TourDAO();
		System.out.println(dao.getComment(1));
	}
}
