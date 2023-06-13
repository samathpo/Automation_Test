import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {


Xls_Reader xls = new Xls_Reader("C:\\Eclip_workspace\\QA Class 30_Data_Parameterization\\src\\TESTSUITE\\SAUCE_LOGIN.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		
		
		for(int i=2;i<=rowCount;i++) {
		
	String username=xls.getCellData("SAUCE", "USERNAME", i);
	String password=xls.getCellData("SAUCE", "PASSWORD", i);
	System.out.println(username+" |"+password);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	driver.quit();

	
	
		

	}
	}
}
