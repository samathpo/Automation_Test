
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling  {
	
	public static int randomString() {
		
		
		
		int id=(int) (Math.random()*100000);
		
		return id;
		
		
	}
	
	

    
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("ken");
	driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
	driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Newyork");
	driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Nsw");
	driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2134");
	driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("0412345678");
	driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("john"+randomString());
	driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	driver.quit();

		 
		
		
		
	

	}

}
