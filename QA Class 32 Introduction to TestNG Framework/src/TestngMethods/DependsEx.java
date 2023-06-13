package TestngMethods;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsEx {
	
	
	@Test
	public void logintest() {
		
		System.out.println("login test");
		
       String expected="Product";
		
		assertEquals(expected, " ");
	}
	
	
	
	@Test(dependsOnMethods="logintest")
	public void addtocart() {
		
		System.out.println("addtocart");
	}

}
