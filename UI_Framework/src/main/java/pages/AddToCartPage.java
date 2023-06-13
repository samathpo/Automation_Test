package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AddToCartPage extends TestBase {
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement remove;
	
	
	public AddToCartPage() {
		  
		  PageFactory.initElements(driver, this);
		  
	  }
	
	public void addtocart() {
		
		addtocart.click();
		cart.click();
	}
	
	
	public void clickRemove() throws InterruptedException {
		
	
	
	
	Thread.sleep(2000);
	remove.click();
	
	}

}
