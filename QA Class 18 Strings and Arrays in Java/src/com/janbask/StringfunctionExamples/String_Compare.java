package com.janbask.StringfunctionExamples;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Selenium";
		String s2="selenium";
		String s3="Selenium";
		
		System.out.println(s1.compareTo(s2));//f
		
		System.out.println(s1.equals(s2));//f
		
		System.out.println(s1==s2);//f
		
		System.out.println(s1.compareToIgnoreCase(s2));//t
		
		
		System.out.println("****************************");

		
		
		  System.out.println(s1.compareTo(s3));//t
		  
		  System.out.println(s1.equals(s3));//t
		  
		  System.out.println(s1==s3);//t
		  
		  System.out.println(s1.compareToIgnoreCase(s3));//f
		 
		
		
		
	}

}
