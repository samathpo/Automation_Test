package TestngMethods;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertions_Ex {
	
	@Test
	public void test() {
		
		String expected="Product";
		
		assertEquals(expected, "cart");
		
	}

}
