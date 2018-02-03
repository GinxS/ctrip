package pojo;

public class TourRoute {
	private Integer route_id;
	private Integer tour_id;
	private Integer day;
	private String play;
	private String time;
	public Integer getRoute_id() {
		return route_id;
	}
	public void setRoute_id(Integer route_id) {
		this.route_id = route_id;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public TourRoute(Integer route_id, Integer tour_id, Integer day, String play, String time) {
		super();
		this.route_id = route_id;
		this.tour_id = tour_id;
		this.day = day;
		this.play = play;
		this.time = time;
	}
	public TourRoute() {
		super();
	}
	@Override
	public String toString() {
		return "TourRoute [route_id=" + route_id + ", tour_id=" + tour_id + ", day=" + day + ", play=" + play
				+ ", time=" + time + "]";
	}
	
}
