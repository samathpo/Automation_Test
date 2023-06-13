import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce_Wind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		Set<String> win= driver.getWindowHandles();
		
		Iterator<String> it=win.iterator();
		
		String parent=it.next();
		
		String child=it.next();
		
		//System.out.println(it.next());
		//System.out.println(it.next());
		
		
		System.out.println(win.size());
		
		driver.switchTo().window(child);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Learn more')]")).click();

	}

}
