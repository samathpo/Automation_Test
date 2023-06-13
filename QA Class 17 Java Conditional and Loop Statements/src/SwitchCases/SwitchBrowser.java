package SwitchCases;

public class SwitchBrowser {

	public static void main(String[] args) {
		
		String browserName="EDGE";
		
		switch(browserName) 
		{
		case "CHROME":
			System.out.println("CHROME BROWSER LAUNCHED");
			break;
		case "FIREFOX":
			System.out.println("FIREFOX BROWSER LAUNCHED");
			break;
		case "EDGE":
			System.out.println("EDGE BROWSER LAUNCHED");
			break;
		default :
			System.out.println("INVALID BROWSER");
		
		}

	}

}
