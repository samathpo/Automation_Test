package Static_KeyWords;

public class Customer {
	static int age=35;
	 String name="Peter";
	
	
public static void cust_info() {
		
		System.out.println("calling cust_info inside customer");
	}
public void cust_salary() {
	
	System.out.println("calling cust_Salary inside Customer");
}


	public static void main(String[] args) {
		
System.out.println(age);
cust_info();
		
		
		
	}

}
