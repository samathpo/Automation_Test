package TestngMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Ex {
	
	@Test
	public void method1() {
		System.out.println("Calling method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("Calling method 2");
	}
	@Test
	public void method3() {
		System.out.println("Calling method 3");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println();
		System.out.println("****CALLING BEFORE METHOD****");
	}
	
	@Test
	public void method4() {
		System.out.println("Calling method 4");
	}
	
	

	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("****CALLING AFTER METHOD****");
		System.out.println();
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("****CALLING BEFORE TEST****");
		
	}
	
	@AfterTest
public void aftertest() {
		
	System.out.println("****CALLING AFTER TEST****");
	}


}
