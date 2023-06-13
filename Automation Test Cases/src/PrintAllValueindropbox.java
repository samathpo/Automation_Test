import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class PrintAllValueindropbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		 WebElement val = driver.findElement(By.xpath("//select[@id='Skills']"));
 		 List<WebElement> alltages = driver.findElements(By.tagName("option"));
 		 
		  System.out.println("Total tags are : " +alltages.size());
		  
		  for(int i = 0; i<alltages.size(); i++) {
		  
		  System.out.println("Links on page are " + alltages.get(i).getAttribute("value"));
		  System.out.println("Links on page are " + alltages.get(i).getText()); 
		  }

		driver.quit();
		  }
	}
