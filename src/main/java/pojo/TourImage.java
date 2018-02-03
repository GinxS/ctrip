package pojo;

public class TourImage {
	private Integer image_id;
	private String image_url;
	private Integer tour_id;
	public Integer getImage_id() {
		return image_id;
	}
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public TourImage(Integer image_id, String image_url, Integer tour_id) {
		super();
		this.image_id = image_id;
		this.image_url = image_url;
		this.tour_id = tour_id;
	}
	public TourImage() {
		super();
	}
	@Override
	public String toString() {
		return "TourImage [image_id=" + image_id + ", image_url=" + image_url + ", tour_id=" + tour_id + "]";
	}
		
}
