package SPringBankingProject.com.acc.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
@Scope("singleton")
public class App 
{
	private Bank bank;
    private Customer customer;
    
    
    
    public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Autowired
	public App(Bank bank, Customer customer) {
		this.bank = bank;
		this.customer = customer;
	}
    
    
    public App() {
		
	}


	public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve Bank bean
        Bank bank = (Bank) context.getBean("bank");
        System.out.println("Bank Name: " + bank.getBank_name());
        System.out.println("Bank ID: " + bank.getBank_id());
        System.out.println("Bank Location: " + bank.getLocation());

        // Retrieve Customer bean
        Customer customer = (Customer) context.getBean("customer");
        System.out.println("Customer ID: " + customer.getCustomer_id());
        System.out.println("Customer Name: " + customer.getCustomer_name());
        System.out.println("Customer Password: " + customer.getPassword());

      
    }
    
}
