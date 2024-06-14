package SPringBankingProject.com.acc.bank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Bank {
	@Value("5453")
	private Integer bank_id;
	@Value("AccBank_Value")
	private String bank_name;
	@Value("Kolkata_Value")
	private String location;
	
	 public Bank() {
			
		}
	 
	public Integer getBank_id() {
		return bank_id;
	}
	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Bank(Integer bank_id, String bank_name, String location) {
		super();
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Bank [bank_id=" + bank_id + ", bank_name=" + bank_name + ", location=" + location + "]";
	}
	
}
