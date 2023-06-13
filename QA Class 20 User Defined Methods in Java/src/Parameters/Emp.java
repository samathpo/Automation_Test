package Parameters;

public class Emp {
	
	public void convert(String name) {
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		
		
	}
	

	public static void main(String[] args) {
		
		
		Emp e = new Emp();
		e.convert("Peter");
		e.convert("WelcOme");
		

	}

}
