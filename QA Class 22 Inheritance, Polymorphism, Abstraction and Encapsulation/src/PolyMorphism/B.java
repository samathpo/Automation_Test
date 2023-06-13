package PolyMorphism;

public class B extends A{
	
	public void method1() {
		
		System.out.println("calling method1 from class B");
		System.out.println("belongs to B class");
		System.out.println("*********************");
	}
	
	public void test() {
		
		System.out.println("calling test method");
	}

	public static void main(String[] args) {
		
		B b = new B();
		
		b.method1();
		b.method2();
		
		b.test();

	}

}
