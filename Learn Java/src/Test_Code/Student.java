package Test_Code;

public class Student {
	int id;
	String name;
	
}

class TestStudent{
		
	public static void main(String[] args) {
		
		Student e1 = new Student();
		Student e2 = new Student();
		
		e1.id = 111;
		e1.name = "Alix";
		e2.id = 112;
		e2.name = "Brown";
		
		System.out.println(e1.id + " " + e1.name);
		System.out.println(e2.id + " " + e2.name);
		

	

	}
}
