package pojo;

public class Company {
	private Integer company_id;
	private String company_name;
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Company(Integer company_id, String company_name) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
	}
	public Company() {
		super();
	}
	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + "]";
	}
	
}
