import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Ex {
	
	
	
	@DataProvider(name="testdata")
	public Object[][] testdata() {
		
		Object[][] cred= {{"standard_user","secret_sauce"},
				          {"problem_user","secret_sauce"},
				          {"locked_out_user","secret_sauce" }                            
		                      };
		
		return cred;
		
	}
	
	
	
	@Test(dataProvider="testdata")
	public void logintest(String uname, String pwd) throws InterruptedException {
		
		System.out.println(uname+"| "+pwd);
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.quit();
		
	}
	
	
	

}
