package NonStatic;

public class Employee {
	String name="Steve";
	double height=6.2;
	char grade ='A';
	int salary=4000;
	
	public void display() {
		
		System.out.println("display");
		
	}
	
	public void info() {
		
		System.out.println("info");
	}

	public static void main(String[] args) {
	
		Employee e = new Employee();
		System.out.println(e.name);
		System.out.println(e.height);
		System.out.println(e.grade);
		System.out.println(e.salary);
		e.display();
		e.info();
		
		
	
     
	}

}
