package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LogOutPage extends TestBase {
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menu;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	
	public LogOutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void logout() {
		
		menu.click();
		logout.click();
	}
	
	

}
