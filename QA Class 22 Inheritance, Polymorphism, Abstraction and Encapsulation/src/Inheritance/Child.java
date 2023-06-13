package Inheritance;

public class Child extends Parent {
	
	public void bike() {
		System.out.println("Child owns a bike");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.bike();
		c.house();
		c.factory();
		System.out.println(c.Lname);
		System.out.println(c.grade);

	}

}
