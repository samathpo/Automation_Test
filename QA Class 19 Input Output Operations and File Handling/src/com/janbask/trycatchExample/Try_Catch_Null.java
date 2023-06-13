package com.janbask.trycatchExample;
public class Try_Catch_Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
			int h=10/0;
			System.out.println(h);
		}
		
		catch(Exception e){
			
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}
		
			
			
	         int k=40;
	         int m=30;
	         int u=k+m;   
	         System.out.println("addition of "+k+" and "+m +" is "+u);

	         System.out.println("eND OF THE PROGRAM");
		
		
	}

}
