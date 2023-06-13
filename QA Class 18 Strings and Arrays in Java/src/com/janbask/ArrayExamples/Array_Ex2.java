package com.janbask.ArrayExamples;

public class Array_Ex2 {

	public static void main(String[] args) {
		String[] student=new String[13];
		student[0]="Henry";
		student[1]="Steve";
		student[2]="Mark";
		student[3]="John";
		student[4]="Alice";
		student[5]="Sam";
		student[4]="Peter";
		
	//	System.out.println(student.length);
		int len=student.length;
		
		for(int i=0;i<len;i++) {
			
			System.out.println(student[i]);
		}
		
		
		

	}

}
