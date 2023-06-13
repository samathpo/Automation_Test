package com.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling  {
	
	
	
	
	public static String random_String() {
		
		String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		System.out.println(value);
			return value;	
				
	}
    
	public static void main(String[] args) throws InterruptedException {
		
		random_String();
		
		
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Eclip_workspace\\QA Class 29_Writing Selenium Test Cases -1\\chromedriver.exe"); // set the chrome
		  
		  
		  WebDriver driver= new ChromeDriver(); // launch the browser
		  
		  
		  
		  
		  driver.get("https://parabank.parasoft.com/parabank/register.htm"); //
		  //navigate to the url 
		  driver.manage().window().maximize(); // maximize the
		  
		  
		  
		  Thread.sleep(3000); 
		  String fname="Lee"; 
		  
		  String lname="Con"; String
		  Address="24 central sydney"; 
		  String city="sydney"; String state=" Aus";
		  String pin ="4178"; String phone="4123456"; 
		  String SSN="78856"; 
		  String Uname=random_String();
		  String pwd="pwd123"; 
		  String confirm="pwd123";
		  
		  driver.get("https://parabank.parasoft.com/parabank/register.htm");
		  driver.manage().window().maximize();
		  
		  // driver.findElement(By.xpath(""))
		  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(
		  fname);
		  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(
		  lname);
		  driver.findElement(By.xpath("//input[@id='customer.address.street']")).
		  sendKeys(Address);
		  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys
		  (city);
		  driver.findElement(By.xpath(" //input[@id='customer.address.state']")).
		  sendKeys(state);
		  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).
		  sendKeys(pin);
		  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(
		  phone);
		  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(SSN);
		  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(
		  Uname);
		  
		  // method("//input[@id='customer.username']").sendKeys("john3365oo");
		  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(pwd
		  ); driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(
		  confirm); driver.findElement(By.xpath("//input[@value='Register']")).click();
		  
		  String msg=driver.findElement(By.xpath("//h1[@class='title']")).getText();
		  
		  System.out.println(msg);
		  
		 
		
		
		
	

	}

}
