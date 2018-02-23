package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import pojo.Comment;
import pojo.Company;
import pojo.Order;
import pojo.Tour;
import pojo.TourDate;
import pojo.TourFee;
import pojo.TourImage;
import pojo.TourInfo;
import pojo.TourRoute;
import pojo.TourRule;
import pojo.Visitor;
import util.DBHelper;
import util.PageUtil;

public class TourDAO extends BaseDAO{
	//����������Ʒ
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
	//�鿴������Ʒ��ϸ��Ϣ
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
	
	//�鿴��ƷͼƬ�б�
	public List<TourImage> getTourImage(Integer tour_id){
		String sql = "select * from tour_image where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourImage.class);
	}
	//�鿴��Ʒ�г��б�
	public List<TourDate> getTourDate(Integer tour_id){
		String sql = "select * from tour_date where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourDate.class);
	}
	//�鿴��Ʒ�����б�
	public List<TourInfo> getTourInfo(Integer tour_id){
		String sql = "select * from tour_info where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourInfo.class);
	}
	//�鿴��Ʒ�г̼ƻ��б�
	public List<TourRoute> getTourRoute(Integer tour_id){
		String sql = "select * from tour_route where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourRoute.class);
	}
	//�鿴��Ʒ���ý����б�
	public List<TourFee> getTourFee(Integer tour_id){
		String sql = "select * from tour_fee where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourFee.class);
	}
	//�鿴��ƷԤ����֪�б�
	public List<TourRule> getTourRule(Integer tour_id){
		String sql = "select * from tour_rule where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},TourRule.class);
	}
	//�鿴��Ʒ����
	public List<Comment> getComment(Integer tour_id){
		String sql = "select * from comment where tour_id=?";
		return super.Query(sql, new Object[]{tour_id},Comment.class);
	}
	//��ȡ��������
	public int getOrdreCount(){
		String sql = "select count(1) from c_order";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = DBHelper.getConn();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				count = rs.getInt("count(1)");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}
	//������ζ�����
	public void addTourOrder(Order order){
		String sql = "insert into c_order(order_id,start_date,tickets_number,tour_id,order_price,user_name,user_tel,user_email,user_id,order_state) values(?,?,?,?,?,?,?,?,?,1)";
		super.update(sql, new Object[]{order.getOrder_id(),order.getStart_date(),order.getTickets_number(),order.getTour_id(),order.getOrder_price(),order.getUser_name(),order.getUser_tel(),order.getUser_email(),order.getUser_id()},DBHelper.getConn());
	}
	//��Ӷ����ο���Ϣ
	public void addVisitor(Visitor visitor){
		String sql = "insert into visitor(visitor_name,identity,tel,order_id) values(?,?,?,?)";
		super.update(sql, new Object[]{visitor.getVisitor_name(),visitor.getIdentity(),visitor.getTel(),visitor.getOrder_id()}, DBHelper.getConn());
	}
	//�ı䶩��״̬
	public void changeOrderState(int order_state,int order_id){
		String sql = "update c_order set order_state = ? where order_id = ? ";
		super.update(sql, new Object[]{order_state,order_id}, DBHelper.getConn());
	}
	//�鿴ȫ������
	public List<Order> getOrder(int user_id){
		String sql = "select * from c_order where user_id = ?";
		return super.Query(sql, new Object[]{user_id}, Order.class);
	}
	//�鿴δ���ж���
	public List<Order> getOrder2(int user_id){
		String sql = "select * from c_order where user_id = ? and order_state = 2";
		return super.Query(sql, new Object[]{user_id}, Order.class);
	}
	//�鿴δ�����
	public List<Order> getOrder1(int user_id){
		String sql = "select * from c_order where user_id = ? and order_state = 1";
		return super.Query(sql, new Object[]{user_id}, Order.class);
	}
	//�鿴δ���۶���
	public List<Order> getOrder3(int user_id){
		String sql = "select * from c_order where user_id = ? and order_state = 3";
		return super.Query(sql, new Object[]{user_id}, Order.class);
	}
	//���������Ʒ����
	public void addComment(Comment comment){
		String sql = "insert into comment(level,comment_text,comment_date,user_id,tour_id) values(?,?,?,?,?)";
		super.update(sql, new Object[]{comment.getLevel(),comment.getComment_text(),comment.getComment_date(),comment.getUser_id(),comment.getTour_id()}, DBHelper.getConn());
	}
	
	public static void main(String[] args) {
		TourDAO dao = new TourDAO();
		System.out.println(dao.getOrdreCount());
	}
}
