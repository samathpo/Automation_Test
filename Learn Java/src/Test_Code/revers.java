package Test_Code;

public class revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello, World!";

        // Print the string in reverse order
        String reversedText = reverseString(text);
        System.out.println("Reversed String: " + reversedText);
    }

    public static String reverseString(String text) {
       // Convert the string to a character array
        char[] characters = text.toCharArray();

        // Reverse the character array
        int start = 0;
        int end = characters.length - 1;
        while (start < end) {
            // Swap characters
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            // Move the indices
            start++;
            end--;
        }

        // Create a new string from the reversed character array
        String reversedText = new String(characters);
        return reversedText;
    }

}


