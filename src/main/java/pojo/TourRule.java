package pojo;

public class TourRule {
	private Integer rule_id;
	private String rule1;
	private String rule2;
	private String rule3;
	private String rule4;
	private String rule5;
	private String rule6;
	private Integer tour_id;
	public Integer getRule_id() {
		return rule_id;
	}
	public void setRule_id(Integer rule_id) {
		this.rule_id = rule_id;
	}
	public String getRule1() {
		return rule1;
	}
	public void setRule1(String rule1) {
		this.rule1 = rule1;
	}
	public String getRule2() {
		return rule2;
	}
	public void setRule2(String rule2) {
		this.rule2 = rule2;
	}
	public String getRule3() {
		return rule3;
	}
	public void setRule3(String rule3) {
		this.rule3 = rule3;
	}
	public String getRule4() {
		return rule4;
	}
	public void setRule4(String rule4) {
		this.rule4 = rule4;
	}
	public String getRule5() {
		return rule5;
	}
	public void setRule5(String rule5) {
		this.rule5 = rule5;
	}
	public String getRule6() {
		return rule6;
	}
	public void setRule6(String rule6) {
		this.rule6 = rule6;
	}
	public Integer getTour_id() {
		return tour_id;
	}
	public void setTour_id(Integer tour_id) {
		this.tour_id = tour_id;
	}
	public TourRule(Integer rule_id, String rule1, String rule2, String rule3, String rule4, String rule5, String rule6,
			Integer tour_id) {
		super();
		this.rule_id = rule_id;
		this.rule1 = rule1;
		this.rule2 = rule2;
		this.rule3 = rule3;
		this.rule4 = rule4;
		this.rule5 = rule5;
		this.rule6 = rule6;
		this.tour_id = tour_id;
	}
	public TourRule() {
		super();
	}
	@Override
	public String toString() {
		return "TourRule [rule_id=" + rule_id + ", rule1=" + rule1 + ", rule2=" + rule2 + ", rule3=" + rule3
				+ ", rule4=" + rule4 + ", rule5=" + rule5 + ", rule6=" + rule6 + ", tour_id=" + tour_id + "]";
	}
	
}	
