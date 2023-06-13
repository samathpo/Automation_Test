package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
	System.out.println(prop.getProperty("Browser"));
		
	//	System.out.println(System.getProperty("user.dir"));
		
		

	}

}
