package Calling_Methods;

public class Student {
	
	
	public void display() {
		
		String name="Steve";
		int marks=85;
		char grade='A';
		
		System.out.println(name+" - "+marks+" -  "+grade);
		
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.display();
		
	}

}
