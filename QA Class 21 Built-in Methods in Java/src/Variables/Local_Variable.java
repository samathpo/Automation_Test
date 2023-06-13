package Variables;

public class Local_Variable {
	String grade="Five";
	
public void info() {
	//local variables- variables defined inside the method can be accessed only inside the method cannot access outside the method
	String name="Jack";
	int age =18;
		
		System.out.println("info method");
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
	
	}
	public void display() {
		String name="Lee";
		int age =10;
		System.out.println("display method");
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
	
	}
	public static void main(String[] args) {
	
		
	}

}
