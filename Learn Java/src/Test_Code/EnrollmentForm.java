package Test_Code;


		import javax.swing.*;

		public class EnrollmentForm {

		    public static void main(String[] args) {
		        // Create JFrame
		        JFrame frame = new JFrame("Enrollment Form");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(400, 300);

		        // Create JPanel
		        JPanel panel = new JPanel();

		        // Create JLabels
		        JLabel nameLabel = new JLabel("Name:");
		        JLabel ageLabel = new JLabel("Age:");
		        JLabel emailLabel = new JLabel("Email:");

		        // Create JTextFields
		        JTextField nameTextField = new JTextField(20);
		        JTextField ageTextField = new JTextField(10);
		        JTextField emailTextField = new JTextField(30);

		        // Create JButton
		        JButton submitButton = new JButton("Submit");

		        // Add components to the panel
		        panel.add(nameLabel);
		        panel.add(nameTextField);
		        panel.add(ageLabel);
		        panel.add(ageTextField);
		        panel.add(emailLabel);
		        panel.add(emailTextField);
		        panel.add(submitButton);

		        // Add panel to the frame
		        frame.getContentPane().add(panel);

		        // Display the frame
		        frame.setVisible(true);
		    }
		

	}


