package Static_KeyWords;

public class Stud {

	static int marks=90;
	static String name="Jack";
	
	public static void stud_info() {
		char grade='C';
		
		System.out.println("Calling stud_info");
		
		System.out.println("Grade "+grade);
			
	}
	public static  void display() {
		
		System.out.println("calling display method inside "
				+ "stud method");
	}
	

	public static void main(String[] args) {
	
	System.out.println(marks);
	System.out.println(name);
   stud_info();
   display();
		
		
		
	}

}