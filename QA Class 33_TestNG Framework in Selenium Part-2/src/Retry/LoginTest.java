package Retry;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;



public class LoginTest  {
	
	
	
	@Test(retryAnalyzer=Retry.RetryLogic.class)
	public void login() {
		
		
		System.out.println("verifying login functionality");
		
		assertEquals(true, false);
	}
	
	

}
