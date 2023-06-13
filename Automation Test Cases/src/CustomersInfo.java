import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class CustomersInfo {

	public static void main(String[] args)throws InterruptedException {{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Tonny");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Jorge");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("112 Ave");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Colton");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("CA");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1123456");
		
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Tonny");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
}
