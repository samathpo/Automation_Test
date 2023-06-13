package Variables;

public class Student {
//variable defined outside the method/function are called global variables or class variables	
	String name="Henry";
	int age=15;
	
	public void info() {
		
		System.out.println("info method");
		System.out.println(name);
		System.out.println(age);
	}
	public void display() {
		System.out.println("display method");
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
	

}
}
