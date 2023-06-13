import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {


Xls_Reader xls = new Xls_Reader("C:\\Eclip_workspace\\Automation Test Cases\\src\\XLSTEST\\CustomersInfo.xlsx");// Directory that Excel file in 
		
		int rowCount=xls.getRowCount("NAME"); //Name of sheet
				
		for(int i=2;i<=rowCount;i++) { //i=2 mean data not count colume's name 
		
	String firstname=xls.getCellData("NAME", "FirstName", i);
	String lastname=xls.getCellData("NAME", "LastName", i);
	String address=xls.getCellData("NAME", "Address", i);
	String city=xls.getCellData("NAME", "City", i);
	String state=xls.getCellData("NAME", "State", i);
	String zipcode=xls.getCellData("NAME", "ZipCode", i);
	String phone=xls.getCellData("NAME", "Phone", i);
	String ssn=xls.getCellData("NAME", "SSN", i);
	String username=xls.getCellData("NAME", "UserName", i);
	String password=xls.getCellData("NAME", "Password", i);
	String confirm=xls.getCellData("NAME", "Confirm", i);
	System.out.println(firstname+" |"+lastname+"|"+address+" |"+city+" |"+state+" | "+zipcode+" |"+phone+" |"+ssn+" |"+username+" |"+password+" |"+confirm);
	Thread.sleep(2000);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(address);
	driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
	driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);
	driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(zipcode);
	driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(phone);
	driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(ssn);
	
	driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(confirm);
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(3000);
	
	
	driver.quit();
		}

	}

}	

