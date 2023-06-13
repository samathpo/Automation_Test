package com.janbask.A;

public class Private_Ex {
	
	private String name="John";
	
	
	private void method1() {
		
		System.out.println("calling method 1");
	}

	public static void main(String[] args) {
		
		Private_Ex p = new Private_Ex();
		
		System.out.println(p.name);
		p.method1();
	}

}
