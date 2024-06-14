package SPringBankingProject.com.acc.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/SPringBankinProject/com/acc/config/beans.xml")
public class TestApplication {
	 @Autowired
	    private App app;

	    @Test
	    public void testBank() {
	        // Test Bank details
	        assertNotNull(app);
	        assertEquals("AccBank", app.getBank().getBank_name());
	        assertEquals("New York", app.getBank().getLocation());
	        //assertEquals(123, app.getBank().getBank_id());
	    }

	    @Test
	    public void testCustomer() {
	        // Test Customer details
	        assertNotNull(app);
	        assertEquals("Abhinav Raj", app.getCustomer().getCustomer_name());
	        assertEquals("password", app.getCustomer().getPassword());
	        //assertEquals(456, app.getCustomer().getCustomer_id());
	    }
}
