package Variables;

public class Employee {
    String role="manager";//global variables
	double salary=521.36;//global variables
	
	
//local variable scope is only inside the function/method
	//local variable cannot be called outside the function/method
	public void emp_info() {
		
		int age=30; //local variable
		String name="john";//local variable
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(role);

	}
	
	public void display()
	{
		System.out.println(role);
		//System.out.println(age);
		System.out.println(salary);
		//System.out.println(name);
		
	}
	public void emp_medi() {
		String name="Henry";
		int medi_no=2341;//local variable
		String plan="Basic"; //local variable
	System.out.println(name);
	System.out.println(medi_no);
	System.out.println(plan);
	System.out.println(role);
	
	}

	public static void main(String[] args) {
		
      Employee e = new Employee();
		System.out.println(e.role);
		System.out.println(e.salary);
		
	
		
		

	}

}
