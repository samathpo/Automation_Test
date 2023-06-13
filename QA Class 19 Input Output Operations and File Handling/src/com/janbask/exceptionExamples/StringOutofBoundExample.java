package com.janbask.exceptionExamples;

public class StringOutofBoundExample {

	public static void main(String[] args) {
		 String a = "This is like chipping "; // length is 22
         char c = a.charAt(14); // accessing 25th element
         System.out.println(c);

	}

}
