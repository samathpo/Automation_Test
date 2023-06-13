import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Ex {

	public static void main(String[] args) {
LinkedList<String> stud= new LinkedList();
		
		stud.add("Mark");
		stud.add("Steve");
		stud.add("Bob");
		stud.add("Jessica");
		stud.add("Alice");
		stud.add("Mark");
		
		System.out.println(stud.size());
		
	
		for(int i=0;i<stud.size();i++) {
			
			System.out.println(stud.get(i));
		}
		
		

	}
	}


