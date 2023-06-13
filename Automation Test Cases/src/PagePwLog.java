
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class PagePwLog {

	public static void main(String[] args) throws InterruptedException {


Xls_Reader xls = new Xls_Reader("C:\\Eclip_workspace\\Automation Test Cases\\src\\XLSTEST\\loginpw.xlsx");// Directory that Excel file in 
		
		int rowCount=xls.getRowCount("NAME"); //Name of sheet
				
		for(int i=2;i<=rowCount;i++) { //i=2 mean data not count colume's name 
		
	String username=xls.getCellData("NAME", "Username", i);
	String password=xls.getCellData("NAME", "Password", i);
	
	System.out.println(username+" |"+password);
	Thread.sleep(2000);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	Thread.sleep(1000);
		
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(3000);
	
	driver.quit();
		}

	}

}	

