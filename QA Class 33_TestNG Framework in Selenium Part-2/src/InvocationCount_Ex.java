import org.testng.annotations.Test;

public class InvocationCount_Ex {
	
	@Test(invocationCount=10)
	public void logintest() {
		
		
		System.out.println("***************** calling login test");
	}
	
	

}
