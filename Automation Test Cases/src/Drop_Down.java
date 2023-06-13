import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException { 
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='first']"));
		Select sel = new Select(dropdown);
		
			sel.selectByIndex(3);
			Thread.sleep(2000);
			
			//sel.selectByValue("Google");
			//Thread.sleep(2000);
			
			//sel.selectByVisibleText("Iphone");
			//Thread.sleep(2000);
		
		WebElement pull = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s = new Select(pull);
			
			s.selectByIndex(1);
			Thread.sleep(2000);
			
			//s.selectByValue(1);
			//Thread.sleep(2000);
			
			//s.selectByVisibleText("Babe Cat");
			//Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//button[@id='custom']")).click();
			//Select dropdown1 = new Select(down);
			//dropdown1.selectByVisibleText("li");
			
			//WebElement opt = driver.findElement(By.xpath("//select[@id='second']"));
			//Select op = new Select(opt);
			//op.selectByIndex(2);
			//Thread.sleep(1000);
			//op.selectByVisibleText("Donut");
			//Thread.sleep(1000);		
			
			WebElement ms = driver.findElement(By.xpath("//select[@id='second']"));
			Select select = new Select(ms);
			select.selectByValue("bonda");
			select.selectByIndex(1);
			Thread.sleep(1000);
			List<WebElement>allItems = select.getAllSelectedOptions();
			
			System.out.println(allItems.size());
			Thread.sleep(1000);
			select.deselectAll();
			select.selectByValue("bonda");
			select.selectByIndex(1);
			Thread.sleep(1000);
			select.deselectByIndex(1);
			List<WebElement> allItems1 = select.getAllSelectedOptions();
			
			System.out.println(allItems1.size());
			Thread.sleep(1000);
			
		driver.quit();
	}

}
