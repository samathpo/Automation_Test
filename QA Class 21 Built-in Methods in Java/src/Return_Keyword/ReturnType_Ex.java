package Return_Keyword;

public class ReturnType_Ex {
	
	
	public String method1() {
		
		int j=10;
		double k=90.23;
		boolean flag=true;
		char c='A';
		String name="Peter";
		
		return name;
		
	}

	public static void main(String[] args) {
      ReturnType_Ex r = new ReturnType_Ex();
      
      String output= r.method1();
      
      System.out.println(output);

	}

}
