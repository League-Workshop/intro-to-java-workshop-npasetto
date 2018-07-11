import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are the best.");
		JOptionPane.showMessageDialog(null, "You do not look old.");
		JOptionPane.showMessageDialog(null, "You are very nice.");
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hi, "+name);
	}
}
