package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LogOutPage;
import pages.LoginPage;
import util.TestUtil;

public class LogoutTest extends TestBase{
	LoginPage l;
	LogOutPage lo;

	@BeforeMethod
	public void init() throws IOException {
		 intialize();
		l=new LoginPage();
		
		 l.login("standard_user","secret_sauce");
	}
	
	
	@Test
	public void logout() throws IOException {
		
		lo=new LogOutPage();
		lo.logout();
		TestUtil.Screenshot();
		
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();

	}
	
}
