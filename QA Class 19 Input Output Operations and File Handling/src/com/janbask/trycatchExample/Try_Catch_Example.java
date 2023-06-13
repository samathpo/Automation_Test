package com.janbask.trycatchExample;
public class Try_Catch_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      String[] stud = new String[3];
      
      try
      {	
		stud[0]="mark";
		stud[1]="steve";
		stud[3]="john";
      }
		catch(Exception e1)
		{
			e1.printStackTrace();
			System.out.println("cannot store values in array beyond the size");
			
		}
		for(int i=0;i<stud.length;i++) {
			
			System.out.println(stud[i]);
		}
	
}
}