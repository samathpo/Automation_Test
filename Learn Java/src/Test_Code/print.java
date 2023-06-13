package Test_Code;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Prime numbers up to 50:");
	        for (int number = 2; number <= 50; number++) {
	            if (isPrime(number)) {
	                System.out.println(number);
	            }
	        }
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}

	

