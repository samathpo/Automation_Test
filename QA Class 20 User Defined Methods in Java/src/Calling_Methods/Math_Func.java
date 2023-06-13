package Calling_Methods;

public class Math_Func {
	
	//method or function
	
	//AccessModifier ReturnType method/functionname
	public void Addition()
	{
			
		int a =20;
		int b=30;
		int c=a+b;
		
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+ c);
				
	}
	
	public void Subraction() 
	{
		int m =200;
		int n=100;
		int k=m-n;
		
		System.out.println("Subraction of two numbers "+m+" and "+n+" is "+ k);
		
		
	}
	

	public static void main(String[] args) {
		
	//CLASSNAME OBJECT= NEW CLASSNAME();
		
	Math_Func m= new Math_Func(); //create a object
	m.Addition();
	m.Subraction();

		
		
		
	}

}
