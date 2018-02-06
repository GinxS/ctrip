package pojo;

import java.util.List;

public class OneOfTour {
	private Tour tour;
	private List tourImage;
	private List tourDate;
	private List tourInfo;
	private List tourRoute;
	private List tourFee;
	private List tourRule;
	private List comment;
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	public List getTourImage() {
		return tourImage;
	}
	public void setTourImage(List tourImage) {
		this.tourImage = tourImage;
	}
	public List getTourDate() {
		return tourDate;
	}
	public void setTourDate(List tourDate) {
		this.tourDate = tourDate;
	}
	public List getTourInfo() {
		return tourInfo;
	}
	public void setTourInfo(List tourInfo) {
		this.tourInfo = tourInfo;
	}
	public List getTourRoute() {
		return tourRoute;
	}
	public void setTourRoute(List tourRoute) {
		this.tourRoute = tourRoute;
	}
	public List getTourFee() {
		return tourFee;
	}
	public void setTourFee(List tourFee) {
		this.tourFee = tourFee;
	}
	public List getTourRule() {
		return tourRule;
	}
	public void setTourRule(List tourRule) {
		this.tourRule = tourRule;
	}
	public List getComment() {
		return comment;
	}
	public void setComment(List comment) {
		this.comment = comment;
	}
	public OneOfTour(Tour tour, List tourImage, List tourDate, List tourInfo, List tourRoute, List tourFee,
			List tourRule, List comment) {
		super();
		this.tour = tour;
		this.tourImage = tourImage;
		this.tourDate = tourDate;
		this.tourInfo = tourInfo;
		this.tourRoute = tourRoute;
		this.tourFee = tourFee;
		this.tourRule = tourRule;
		this.comment = comment;
	}
	public OneOfTour() {
		super();
	}
	@Override
	public String toString() {
		return "OneOfTour [tour=" + tour + ", tourImage=" + tourImage + ", tourDate=" + tourDate + ", tourInfo="
				+ tourInfo + ", tourRoute=" + tourRoute + ", tourFee=" + tourFee + ", tourRule=" + tourRule
				+ ", comment=" + comment + "]";
	}
	
	
}
