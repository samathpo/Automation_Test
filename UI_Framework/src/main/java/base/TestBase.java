package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	FileInputStream fis;
	Properties prop;
	public static WebDriver driver;
	
	
	
	public void intialize() throws IOException {
		
		
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		
		 prop = new Properties();
		prop.load(fis);
		
	    String bname= prop.getProperty("Browser");
	    
	    
	    switch(bname) 
	    {
	    case "chrome":
	    	driver = new ChromeDriver();
	    	break;
	   
	    case "firefox":
	    	driver= new FirefoxDriver();
	    	break;
	    	
	    case "edge": 	
	    	driver= new EdgeDriver();
	    	break;
	    
	    	default:
	    		
	    		System.out.println("Invalid Browser");
	  
	    
	    
	    }
	
	    String url=prop.getProperty("url");
	    int timeout=Integer.parseInt(prop.getProperty("timeout"));
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	    driver.manage().window().maximize();
	    driver.get(url);
	
	
	}

}
