package PolyMorphism;

public class MethodOverloading {
	
    public void method(int a) {
    	
    	System.out.println("calling method with one integer arguments/parameters");
    }
 public void method(double b, double j) {
    	
    	System.out.println("calling method with two double arguments/parameters");
    }
 public void method(String a, char c) {
 	
 	System.out.println("calling method with one string and one char arguments/parameters");
 }
 public void method(int b,double d, String c) {
 	
 	System.out.println("calling method with int, double , string  arguments/parameters");
 }
 public void method(int a, int b) {
 	
 	System.out.println("calling method with two int  arguments/parameters");
 }	
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.method(23,13 );
		m.method( 56,32.3,"joe");
		m.method(56.32,16.23 );
		m.method(12,24 );
		m.method(63);
		m.method(100);
		m.method("Peter",'H' );

	}

}
