package Test_Code;

public class fix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 100; // Specify the limit

        System.out.println("Multiples of 7:");
        printMultiples(7, limit);

        System.out.println("Multiples of 9:");
        printMultiples(9, limit);

        System.out.println("Multiples of 13:");
        printMultiples(13, limit);
    }

    public static void printMultiples(int number, int limit) {
        for (int i = number; i <= limit; i += number) {
            System.out.println(i);
        }
        System.out.println();
    }

	}


