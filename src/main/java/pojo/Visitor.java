package pojo;

public class Visitor {
	private int visitor_id;
	private String visitor_name;
	private String identity;
	private String tel;
	private int order_id;
	public int getVisitor_id() {
		return visitor_id;
	}
	public void setVisitor_id(int visitor_id) {
		this.visitor_id = visitor_id;
	}
	public String getVisitor_name() {
		return visitor_name;
	}
	public void setVisitor_name(String visitor_name) {
		this.visitor_name = visitor_name;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Visitor(int visitor_id, String visitor_name, String identity, String tel, int order_id) {
		super();
		this.visitor_id = visitor_id;
		this.visitor_name = visitor_name;
		this.identity = identity;
		this.tel = tel;
		this.order_id = order_id;
	}
	public Visitor() {
		super();
	}
	@Override
	public String toString() {
		return "Visitor [visitor_id=" + visitor_id + ", visitor_name=" + visitor_name + ", identity=" + identity
				+ ", tel=" + tel + ", order_id=" + order_id + "]";
	}
	
}
