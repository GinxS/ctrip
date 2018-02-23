package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import pojo.Comment;
import pojo.OneOfTour;
import pojo.Order;
import pojo.Tour;
import pojo.Visitor;
import services.TourServices;
import util.PageUtil;

public class BaseController extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String url = request.getRequestURI();
		String action = url.substring(url.lastIndexOf("/")+1,url.indexOf("."));
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			Class<BaseController> clazz = BaseController.class;
			Object obj = clazz.newInstance();
			Method method = clazz.getMethod(action,HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(obj, request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//旅游搜索
	public void tsearch(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		TourServices service = new TourServices();
		PageUtil<Tour> pageUtil = new PageUtil<Tour>();
		service.searchTour(request.getParameter("search"), pageUtil);
		System.out.println(JSON.toJSON(pageUtil).toString());
		out.write(JSON.toJSON(pageUtil).toString());
	}
	//旅游详情
	public void tdetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		TourServices service = new TourServices();
		int tour_id = Integer.valueOf(request.getParameter("tour_id"));
		OneOfTour ot = new OneOfTour();
		ot.setTour(service.getTour(tour_id));
		ot.setTourImage(service.getTourImage(tour_id));
		ot.setTourDate(service.getTourDate(tour_id));
		ot.setTourInfo(service.getTourInfo(tour_id));
		ot.setTourRoute(service.getTourRoute(tour_id));
		ot.setTourFee(service.getTourFee(tour_id));
		ot.setTourRule(service.getTourRule(tour_id));
		ot.setComment(service.getComment(tour_id));
		out.write(JSON.toJSON(ot).toString());
	}
	//申请预定
	public void tbook(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TourServices service = new TourServices();
		String tour_id = request.getParameter("tour_id");
		Tour tour = service.getTour(Integer.valueOf(tour_id));
		response.getWriter().write(JSON.toJSON(tour).toString());
	}
	//提交订单
	public void addTourOrder(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TourServices service = new TourServices();
		Order order = new Order();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		order.setStart_date(format.parse(request.getParameter("start_date")));
		order.setTickets_number(Integer.valueOf(request.getParameter("tickets_number")));
		order.setTour_id(Integer.valueOf(request.getParameter("tour_id")));
		order.setOrder_price(Integer.valueOf(request.getParameter("order_price")));
		order.setUser_name(request.getParameter("user_name"));
		order.setUser_tel(request.getParameter("user_tel"));
		order.setUser_email(request.getParameter("user_email"));
		order.setUser_id(Integer.valueOf(request.getParameter("user_id")));
		int order_id = service.getOrdreCount()+1;
		order.setOrder_id(order_id);
		System.out.println(service.getOrdreCount());
		service.addTourOrder(order);
		for (int i = 1; i <= Integer.valueOf(request.getParameter("tickets_number")); i++) {
			Visitor visitor = new Visitor();
			visitor.setOrder_id(order_id);
			visitor.setVisitor_name(request.getParameter("visitor_name"+i));
			visitor.setIdentity(request.getParameter("identity"+i));
			visitor.setTel(request.getParameter("tel"+i));
			service.addVisitor(visitor);
		}
	}
	//添加评论
	public void tcomment(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Comment comment = new Comment();
		comment.setLevel(Integer.valueOf(request.getParameter("level")));
		comment.setComment_text(request.getParameter("comment_text"));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		comment.setComment_date(format.parse(request.getParameter("comment_date")));
		comment.setTour_id(Integer.valueOf(request.getParameter("tour_id")));
		comment.setUser_id(Integer.valueOf(request.getParameter("user_id")));
		TourServices service = new TourServices();
		service.addComment(comment);
	}
	
	public void payOrder(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TourServices service = new TourServices();
		int order_id = Integer.valueOf(request.getParameter("order_id"));
		service.changeOrderState(2, order_id);
	}
}
