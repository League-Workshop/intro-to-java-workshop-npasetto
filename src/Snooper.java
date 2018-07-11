import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String address = JOptionPane.showInputDialog("What is your house address?");
	String city = JOptionPane.showInputDialog("What city do you live in?");
	String SSN = JOptionPane.showInputDialog("What is your social security number?");
	String CCN = JOptionPane.showInputDialog("What is your credit card number?");
	JOptionPane.showMessageDialog(null, "I know your credit card number! It is "
			+ ""+CCN+"! I am going to steal lots of money from you!");
}   
}
