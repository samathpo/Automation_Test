package SwitchCases;

public class Continue_Ex {

	public static void main(String[] args) {

		int search=11;
		
		for(int i=0;i<20;i++) {
			
			if(i==search)
				continue;
			
			System.out.println(i);
		}

	}

}
