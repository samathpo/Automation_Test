package Return_Keyword;

public class Addition {
	
	public int twoadd() {
		
		int a =20;
		int b =30;
		int c=a+b;
		
		//System.out.println("output is "+c);
		
		return c;
	
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		int value=  add.twoadd();
		System.out.println(value);
		
		
		
	}

}
