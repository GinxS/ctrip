package pojo;

import java.util.Date;

public class Comment {
	private Integer comment_id;
	private Integer level;
	private String comment_text;
	private String comment_image1;
	private String comment_image2;
	private String comment_image3;
	private String comment_image4;
	private Date comment_date;
	private Integer user_id;
	private Integer tour_id;
	private Integer hotel_id;
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getComment_text() {
		return comment_text;
	}
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}
	public String getComment_image1() {
		return comment_image1;
	}
	public void setComment_image1(String comment_image1) {
		this.comment_image1 = comment_image1;
	}
	public String getComment_image2() {
		return comment_image2;
	}
	public void setComment_image2(String comment_image2) {
		this.comment_image2 = comment_image2;
	}
	public String getComment_image3() {
		return comment_image3;
	}
	public void setComment_image3(String comment_image3) {
		this.comment_image3 = comment_image3;
	}
	public String getComment_image4() {
		return comment_image4;
	}
	public void setComment_image4(String comment_image4) {
		this.comment_image4 = comment_image4;
	}
	public Date getComment_date() {
		return comment_date;
	}
	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public Integer getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(Integer hotel_id) {
		this.hotel_id = hotel_id;
	}
	public Comment(Integer comment_id, Integer level, String comment_text, String comment_image1, String comment_image2,
			String comment_image3, String comment_image4, Date comment_date, Integer user_id, Integer tour_id,
			Integer hotel_id) {
		super();
		this.comment_id = comment_id;
		this.level = level;
		this.comment_text = comment_text;
		this.comment_image1 = comment_image1;
		this.comment_image2 = comment_image2;
		this.comment_image3 = comment_image3;
		this.comment_image4 = comment_image4;
		this.comment_date = comment_date;
		this.user_id = user_id;
		this.tour_id = tour_id;
		this.hotel_id = hotel_id;
	}
	public Comment() {
		super();
	}
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", level=" + level + ", comment_text=" + comment_text
				+ ", comment_image1=" + comment_image1 + ", comment_image2=" + comment_image2 + ", comment_image3="
				+ comment_image3 + ", comment_image4=" + comment_image4 + ", comment_date=" + comment_date
				+ ", user_id=" + user_id + ", tour_id=" + tour_id + ", hotel_id=" + hotel_id + "]";
	}
	
}
