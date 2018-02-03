package pojo;

public class TourFee {
	private Integer fee_id;
	private String fee1;
	private String fee2;
	private Integer tour_id;
	public Integer getFee_id() {
		return fee_id;
	}
	public void setFee_id(Integer fee_id) {
		this.fee_id = fee_id;
	}
	public String getFee1() {
		return fee1;
	}
	public void setFee1(String fee1) {
		this.fee1 = fee1;
	}
	public String getFee2() {
		return fee2;
	}
	public void setFee2(String fee2) {
		this.fee2 = fee2;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public TourFee(Integer fee_id, String fee1, String fee2, Integer tour_id) {
		super();
		this.fee_id = fee_id;
		this.fee1 = fee1;
		this.fee2 = fee2;
		this.tour_id = tour_id;
	}
	public TourFee() {
		super();
	}
	@Override
	public String toString() {
		return "TourFee [fee_id=" + fee_id + ", fee1=" + fee1 + ", fee2=" + fee2 + ", tour_id=" + tour_id + "]";
	}
	
}
