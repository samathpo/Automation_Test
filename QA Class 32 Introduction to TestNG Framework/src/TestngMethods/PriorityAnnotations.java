package TestngMethods;

import org.testng.annotations.Test;

public class PriorityAnnotations {
	
	@Test(priority=1)
public void registertest() {
	
	System.out.println("registertest");
}
	
	@Test(priority=2)
	public void invoicetest() {
		
		System.out.println("invoicetest");
	}
	
	@Test(priority=-1)
public void logouttest() {
		
		System.out.println("logouttest");
	}

	
	
	@Test(priority=4)

public void addtocarttest() {
	
	System.out.println("addtocarttest");
}
	@Test(priority=0)
	public void drafttest() {
		
		System.out.println("drafttest");
	}


}
