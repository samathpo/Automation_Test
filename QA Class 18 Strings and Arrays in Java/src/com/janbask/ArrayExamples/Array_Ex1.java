package com.janbask.ArrayExamples;

public class Array_Ex1 {

	public static void main(String[] args) {
		
		int[] marks=new int[5];
		
		marks[0]=90;
		marks[1]=80;
		marks[2]=78;
		marks[3]=85;
		marks[1]=0;
		marks[3]=marks[1]-marks[3];
		marks[4]=65;
		marks[1]=50;
		marks[1]=35;
		marks[2]=marks[1]+marks[2];
		marks[2]=marks[4]+marks[3];
		
		
		System.out.println(marks[2]);
		
		
		
	}
		
		
}
