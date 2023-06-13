import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Option {

	public static void main(String[] args) throws InterruptedException { 
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='employees_c']"));
		Select select = new Select(dropdown);
		
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		
		//select.selectByValue("level1"); 
		//Thread.sleep(1000);
		
		//select.selectByVisibleText("51 - 100 employees"); 
		//Thread.sleep(1000);
		
		//select.selectByIndex(5);
		//Thread.sleep(1000);
		
		
		driver.quit();
		
	}
}
