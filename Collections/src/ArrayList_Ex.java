import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		
		ArrayList<String> stud= new ArrayList();
		
		stud.add("Mark");
		stud.add("Steve");
		stud.add("Bob");
		stud.add("Jessica");
		stud.add("Alice");
		
		System.out.println(stud.size());
		
	
		for(int i=0;i<stud.size();i++) {
			
			System.out.println(stud.get(i));
		}
		
		

	}

}
