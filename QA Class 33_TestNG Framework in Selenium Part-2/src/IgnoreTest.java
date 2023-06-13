import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test(enabled=false)
	public void method1() {
		
		System.out.println("method 1");
	}
	
	
	@Test
public void method2() {
		
		System.out.println("method 2");
	}

}
