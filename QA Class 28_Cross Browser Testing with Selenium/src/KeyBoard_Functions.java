

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_Functions {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		 //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
       
        // Enter the Full Name
     driver.findElement(By.id("userName")). sendKeys("Mr.James ken");
      
     Thread.sleep(3000);
        //Enter the Email
       driver.findElement(By.id("userEmail")).sendKeys("Jame@hotmail.com");
       Thread.sleep(3000);
        
        // Enter the Current Address
        driver.findElement(By.id("currentAddress")).sendKeys("454 Baker street London");
        Thread.sleep(3000);
        
        // Copy the Current Address
        driver.findElement(By.id("currentAddress")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Thread.sleep(3000);
       
       
        driver.findElement(By.id("currentAddress")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
       
        
        //Press the TAB Key to Switch Focus to Permanent Address
        driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
        Thread.sleep(3000);
        
        //Paste the Address in the Permanent Address field
     
       driver.findElement(By.id("permanentAddress")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
        
     Thread.sleep(3000);
     
     System.out.println(" done ");
        
        
        driver.close();
		

	}

}
