package Calling_Methods;

public class Odd_Even_Func {
	
	
	
	
	public void print(int limit) {
		
		for(int i=1;i<=limit;i=i+2) {
			
			System.out.println(i);
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
	Odd_Even_Func o = new Odd_Even_Func();
	o.print(50);
		
		
		
	}

}
