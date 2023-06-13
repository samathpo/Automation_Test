package com.janbask.C;

import com.janbask.D.Protected_Ex;

public class R1 extends Protected_Ex{

	public static void main(String[] args) {
	
		/*
		 * Protected_Ex p = new Protected_Ex(); p.display();
		 * System.out.println(p.grade);
		 */
		
		R1 r = new R1();
		
		System.out.println(r.grade);
		r.display();

	}

}
