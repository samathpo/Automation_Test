import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("black");
		colors.add("white");
		colors.add("blue");
		colors.add("green");
		colors.add("black");//duplicate
		colors.add("White");
		colors.add("blue");//duplicate
		colors.add("Yellow");
		
		System.out.println(colors.size());
		
		Iterator<String> it = colors.iterator();//create a pointer to the set
		
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		//System.out.println(colors.get(5));
		
	}

}
