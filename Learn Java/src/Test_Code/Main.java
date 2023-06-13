package Test_Code;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " +name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"Your age is  "+ age + " year old ");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is your Heith"));
		JOptionPane.showMessageDialog(null, "You are " +height+" cm tall");

	}

}
