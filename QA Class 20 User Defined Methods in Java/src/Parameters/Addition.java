package Parameters;

public class Addition {
	
	//method with parameters/arguments
	public void add(int a, int b)
	{
			
		
		int c=a+b;
		
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+ c);
				
	}



	public static void main(String[] args) {
		
	Addition a = new Addition();
	a.add(20,30);
	a.add(10,30);
	a.add(100,200);
	a.add(60,90);
		

	}

}
