package pojo;

public class Tour {
	private Integer tour_id;
	private String tour_name;
	private Integer tour_price;
	private Company tour_company;
	private String recommend;
	private Country country_id;
	private String tour_image;
	private Integer tour_level;
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public String getTour_name() {
		return tour_name;
	}
	public void setTour_name(String tour_name) {
		this.tour_name = tour_name;
	}
	public Integer getTour_price() {
		return tour_price;
	}
	public void setTour_price(Integer tour_price) {
		this.tour_price = tour_price;
	}
	public Company getTour_company() {
		return tour_company;
	}
	public void setTour_company(Company tour_company) {
		this.tour_company = tour_company;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public Country getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Country country_id) {
		this.country_id = country_id;
	}
	public String getTour_image() {
		return tour_image;
	}
	public void setTour_image(String tour_image) {
		this.tour_image = tour_image;
	}
	public Integer getTour_level() {
		return tour_level;
	}
	public void setTour_level(Integer tour_level) {
		this.tour_level = tour_level;
	}
	public Tour(Integer tour_id, String tour_name, Integer tour_price, Company tour_company, String recommend,
			 Country country_id, String tour_image, Integer tour_level) {
		super();
		this.tour_id = tour_id;
		this.tour_name = tour_name;
		this.tour_price = tour_price;
		this.tour_company = tour_company;
		this.recommend = recommend;
		this.country_id = country_id;
		this.tour_image = tour_image;
		this.tour_level = tour_level;
	}
	public Tour() {
		super();
	}
	@Override
	public String toString() {
		return "Hotel [tour_id=" + tour_id + ", tour_name=" + tour_name + ", tour_price=" + tour_price
				+ ", tour_company=" + tour_company + ", recommend=" + recommend + ", country_id=" + country_id
				+ ", tour_image=" + tour_image + ", tour_level=" + tour_level + "]";
	}
	
	
	
}
