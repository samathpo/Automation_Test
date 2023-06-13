package Static_KeyWords;


public class Employee {
	 String name="Steve";
	 static double height=6.2;
	 static char grade ='A';
	 static int salary=4000;
	 static boolean flag=true;
	
// accessmodifer returnType function/method name	
	
	public static void display() {
		
		System.out.println("display");
		
	}
	
	public   void info() {
		
		System.out.println("info");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		
		System.out.println(e.name);
		System.out.println(height);
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(flag);
		display();
		e.info();
     
	}

}
