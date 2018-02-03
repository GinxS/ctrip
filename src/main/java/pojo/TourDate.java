package pojo;

import java.util.Date;

public class TourDate {
	private Integer id;
	private Date tour_date;
	private Integer tour_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getTour_date() {
		return tour_date;
	}
	public void setTour_date(Date tour_date) {
		this.tour_date = tour_date;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public TourDate(Integer id, Date tour_date, Integer tour_id) {
		super();
		this.id = id;
		this.tour_date = tour_date;
		this.tour_id = tour_id;
	}
	public TourDate() {
		super();
	}
	@Override
	public String toString() {
		return "TourDate [id=" + id + ", tour_date=" + tour_date + ", tour_id=" + tour_id + "]";
	}
	
}
