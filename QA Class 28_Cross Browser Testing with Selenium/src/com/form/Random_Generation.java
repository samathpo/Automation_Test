package com.form;

import java.util.Random;

public class Random_Generation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
   String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		System.out.println(value);
		}

	}


