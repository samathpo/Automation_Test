package Inheritance;

public class Parent  {
	
	String Lname="Xavier";
	char grade= 'A';
	
	public void house() {
		
		System.out.println("Parent owns house");
		
	}
	
	public void factory() {
		
		System.out.println("Parent owns factory");
	}
	

	public static void main(String[] args) {
		Parent p = new Parent();
		p.house();
		p.factory();
		System.out.println(p.Lname);
		System.out.println(p.grade);
		

	}

}
