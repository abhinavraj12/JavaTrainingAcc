package SPringBankingProject.com.acc.bank;

public class Customer {
	private Integer customer_id;
	private String customer_name;
	private String password;
	
	 public Customer() {
			
	 }
	 
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(Integer customer_id, String customer_name, String password) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", password=" + password
				+ "]";
	}
	
}
