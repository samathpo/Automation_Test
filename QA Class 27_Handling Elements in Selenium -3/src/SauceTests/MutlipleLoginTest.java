package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleLoginTest {
	
	public void login(String uname, String pwd) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.quit();
	}

	public static void main(String[] args) {
		
		MutlipleLoginTest m = new MutlipleLoginTest();
		m.login("standard_user","secret_sauce");
		m.login("locked_out_user","secret_sauce");
		m.login("problem_user","secret_sauce");
		m.login("performance_glitch_user","secret_sauce");
	}

}
