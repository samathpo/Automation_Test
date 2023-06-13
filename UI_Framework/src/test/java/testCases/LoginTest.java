package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import util.TestUtil;

public class LoginTest extends TestBase{
	LoginPage l;
	
	@BeforeMethod
	public void init() throws IOException {
		
		 intialize();
		 l=new LoginPage();
	}
	
		
	@Test
	public void verifyValidLogin() throws IOException {
		//LoginPage l=new LoginPage();
		l.login("standard_user","secret_sauce");
		TestUtil.Screenshot();
			
	}
	
	@Test
	public void verifyInValidLogin() throws IOException {	
		//LoginPage l=new LoginPage();
		l.login("standard_user","secret_sauce1");	
		TestUtil.Screenshot();
		
	}
	
	@AfterMethod
public void teardown() {
	
	driver.quit();

}
}
