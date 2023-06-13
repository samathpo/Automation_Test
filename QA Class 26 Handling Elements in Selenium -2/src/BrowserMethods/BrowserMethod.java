package BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize browser
		
		//driver.get("https://www.saucedemo.com");// navigate
		
		driver.navigate().to("https://www.saucedemo.com");
        String title=driver.getTitle();//get titel
        System.out.println(title);
        
       String pageSource= driver.getPageSource();//get page source
       
       System.out.println(pageSource);
       
       //driver.close();
       
       driver.quit();
	}

}
