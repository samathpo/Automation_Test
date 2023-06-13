package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	 
	
	  @FindBy(xpath="//input[@id='user-name']")
		WebElement username;	  
	  
	  @FindBy(xpath="//input[@id='password']")
			WebElement password;	
	  
	  @FindBy(xpath="//input[@id='login-button']")
		WebElement login;	
	
	
  public LoginPage() {
	  
	  PageFactory.initElements(driver, this);
	  
  }
	  
	  
	
	public void login(String uname, String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
		
		
	}

}
