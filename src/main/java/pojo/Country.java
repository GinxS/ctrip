package pojo;

public class Country {
	private Integer country_id;
	private String country_name;
	public Integer getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public Country(Integer country_id, String country_name) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + "]";
	}
	
}
