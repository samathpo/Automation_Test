package ListenersImp;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		
		System.out.println("report passed");
		
		
	}
	
public void onTestFailure(ITestResult result) {
	ITestListener.super.onTestFailure(result);
	System.out.println("report failed");
		
	}

public void onTestSkipped(ITestResult result) {
	ITestListener.super.onTestSkipped(result);
	System.out.println("report skipped");
	
}
}
