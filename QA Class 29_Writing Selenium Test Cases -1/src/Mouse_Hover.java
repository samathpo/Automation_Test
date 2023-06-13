

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		

		

		WebDriver driver= new ChromeDriver(); // launch the browser
		
		
	driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/"); // navigate to the url
		
		
		Actions act = new Actions(driver);
		WebElement main=driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		
		act.moveToElement(main).build().perform();// mouse hover
		
		
	
		driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();
		

}
	
}
