import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Online {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo-opencart.com/index.php?route=common/home");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/nav[1]/div[2]/ul[1]/li[4]/a[1]")).click();
	
		
		driver.quit();
	}

}
