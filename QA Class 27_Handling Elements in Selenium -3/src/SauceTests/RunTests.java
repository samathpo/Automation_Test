package SauceTests;

public class RunTests {

	public static void main(String[] args) {
	LoginTest l= new LoginTest();
	l.login();
	
	AddToCartTest a = new AddToCartTest();
	a.addtocart();
	
	LogoutTest lo= new LogoutTest();
	lo.logout();
	}

}
