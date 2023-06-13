import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Button_Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
				
		WebElement trialaction = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		a.doubleClick(trialaction).perform();
		
		Actions actions = new Actions(driver);
 		WebElement app = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		actions.contextClick(app).perform();
		
		
 		//driver.findElement(By.xpath("//button[@id='c9BjQ']")).click();
 		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Borima");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Borima@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Fontana");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("California.");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		System.out.println("Done");
		
//		driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")).click();
		
		driver.quit();
		
	}

}
