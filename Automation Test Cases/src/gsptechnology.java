import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class gsptechnology {
		
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo-opencart.com/index.php?route=account/register");
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Borin");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Koy");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("hgcbb@yahoo.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-confirm']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		//WebElement des = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
		//Select sel = new Select(des);
		//sel.selectByVisibleText("Mac (1)");
		
//		WebElement r = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		r.sendKeys("PC");
//		r.sendKeys(Keys.RETURN);
//		Thread.sleep(2000);
		driver.quit();
	}

}
