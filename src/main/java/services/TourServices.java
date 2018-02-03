package services;

import java.util.List;

import dao.TourDAO;
import pojo.Comment;
import pojo.Tour;
import pojo.TourDate;
import pojo.TourFee;
import pojo.TourImage;
import pojo.TourInfo;
import pojo.TourRoute;
import pojo.TourRule;
import util.PageUtil;

public class TourServices {
	private TourDAO dao;
	public TourServices(){
		dao=new TourDAO();
	}
	public TourDAO getDao() {
		return dao;
	}
	public void setDao(TourDAO dao) {
		this.dao = dao;
	}
	public void searchTour(String tour_name,PageUtil<Tour> pageUtil){
		dao.searchTour(tour_name, pageUtil);
	}
	public Tour getTour(Integer tour_id){
		return dao.getTour(tour_id);
	}
	public List<TourImage> getTourImage(Integer tour_id){
		return dao.getTourImage(tour_id);
	}
	public List<TourDate> getTourDate(Integer tour_id){
		return dao.getTourDate(tour_id);
	}
	public List<TourInfo> getTourInfo(Integer tour_id){
		return dao.getTourInfo(tour_id);
	}
	public List<TourRoute> getTourRoute(Integer tour_id){
		return dao.getTourRoute(tour_id);
	}
	public List<TourFee> getTourFee(Integer tour_id){
		return dao.getTourFee(tour_id);
	}
	public List<TourRule> getTourRule(Integer tour_id){
		return dao.getTourRule(tour_id);
	}
	public List<Comment> getComment(Integer tour_id){
		return dao.getComment(tour_id);
	}
		
}
