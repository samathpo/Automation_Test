package Static_KeyWords;

public class Cust {
	static int age=20;
	 String name="Bob";
	
	//static method
	
	public static void cust_info() {
		
		System.out.println("calling cust_info");
	}
	//non static method
	public void cust_salary() {
		
		System.out.println("calling cust_Salary");
	}

	public static void main(String[] args) {
		
	Cust c = new Cust();
	System.out.println(c.name);
	c.cust_salary();
	
	System.out.println(age);
	cust_info();
		
		
	
	}

}
