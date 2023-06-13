package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddToCartPage;
import pages.LoginPage;
import util.TestUtil;

public class AddTocartTest extends TestBase {
	LoginPage l;
	AddToCartPage a;
	
	@BeforeMethod
	public void init() throws IOException {
		
		 intialize();
		 l=new LoginPage();
		 l.login("standard_user","secret_sauce");
		// a= new AddToCartPage();
		
		
	}
	
	
	@Test
	public void verifyaddtocart() throws IOException {
 
		a.addtocart();
		TestUtil.Screenshot();
		
	
	}
	@Test
	public void verifyRemoveButton() throws InterruptedException, IOException {
		 a= new AddToCartPage();
		 a.addtocart();
		 
		 String actual=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).getText();
			
			assertEquals(actual, "Remove");
			TestUtil.Screenshot();
			
		a.clickRemove();
		
		
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}
}
