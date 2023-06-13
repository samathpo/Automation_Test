package dataTypeExamples;

public class DataType_Ex {

	public static void main(String[] args) {
		//Integer
		//once the variable is defined for particular data type you cannot define it again
		
		int b=20;
		int y=30;
		
		System.out.println("b");//b
		System.out.println(b);//20
		
		System.out.println(y);//30
		
		 b=40;
		
		System.out.println(b);//40
		b=y+b;
		System.out.println(b);//70
		y=b*y;
		System.out.println(y); //2100
		System.out.println(b);//70
		b=10+b;
		System.out.println(b);//80
		y=b+y;
		System.out.println(b);//80
		System.out.println(y);//2180
		b=y-2*b;
		System.out.println(b);//2020
		
	
		

	}

}
