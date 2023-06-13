import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag_labs {

	public static void main(String[] args)throws InterruptedException { {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(1000);
									
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ruby");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Jone");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		Thread.sleep(1000);
		
		 driver.quit();

		}

	}
}
