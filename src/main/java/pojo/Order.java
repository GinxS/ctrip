package pojo;

import java.util.Date;

public class Order {
	private int order_id;
	private Date start_date;
	private int tickets_number;
	private int hotel_id;
	private int tour_id;
	private int order_price;
	private String user_name;
	private String user_tel;
	private String user_email;
	private int user_id;
	private int order_state;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public int getTickets_number() {
		return tickets_number;
	}
	public void setTickets_number(int tickets_number) {
		this.tickets_number = tickets_number;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public int getTour_id() {
		return tour_id;
	}
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}
	public int getOrder_price() {
		return order_price;
	}
	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getOrder_state() {
		return order_state;
	}
	public void setOrder_state(int order_state) {
		this.order_state = order_state;
	}
	public Order(int order_id, Date start_date, int tickets_number, int hotel_id, int tour_id, int order_price,
			String user_name, String user_tel, String user_email, int user_id, int order_state) {
		super();
		this.order_id = order_id;
		this.start_date = start_date;
		this.tickets_number = tickets_number;
		this.hotel_id = hotel_id;
		this.tour_id = tour_id;
		this.order_price = order_price;
		this.user_name = user_name;
		this.user_tel = user_tel;
		this.user_email = user_email;
		this.user_id = user_id;
		this.order_state = order_state;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", start_date=" + start_date + ", tickets_number=" + tickets_number
				+ ", hotel_id=" + hotel_id + ", tour_id=" + tour_id + ", order_price=" + order_price + ", user_name="
				+ user_name + ", user_tel=" + user_tel + ", user_email=" + user_email + ", user_id=" + user_id
				+ ", order_state=" + order_state + "]";
	}
	
	
}
