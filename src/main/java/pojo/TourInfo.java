package pojo;

public class TourInfo {
	private Integer information_id;
	private String info_image;
	private String info_text;
	private Integer tour_id;
	public Integer getInformation_id() {
		return information_id;
	}
	public void setInformation_id(Integer information_id) {
		this.information_id = information_id;
	}
	public String getInfo_image() {
		return info_image;
	}
	public void setInfo_image(String info_image) {
		this.info_image = info_image;
	}
	public String getInfo_text() {
		return info_text;
	}
	public void setInfo_text(String info_text) {
		this.info_text = info_text;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public TourInfo(Integer information_id, String info_image, String info_text, Integer tour_id) {
		super();
		this.information_id = information_id;
		this.info_image = info_image;
		this.info_text = info_text;
		this.tour_id = tour_id;
	}
	public TourInfo() {
		super();
	}
	@Override
	public String toString() {
		return "TourInfo [information_id=" + information_id + ", info_image=" + info_image + ", info_text=" + info_text
				+ ", tour_id=" + tour_id + "]";
	}
	
}
