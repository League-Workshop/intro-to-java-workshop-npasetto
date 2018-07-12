package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			// 2. Make a variable that will hold a random number and put a random number
			// into this variable using "new Random().nextInt(4)"
			Random factory = new Random();
			int num = factory.nextInt(4);

			// 7. If the random number is nextint(4)
			// 3. Print out this variable
			System.out.println(num);
			// 4. Get the user to enter something that they think is awesome
			String awesome = JOptionPane.showInputDialog("Enter something that you think is awesome");
			// 5. If the random number is 0
			if (num == 0) {

				// -- tell the user whatever they entered is awesome!
				JOptionPane.showMessageDialog(null, awesome + " is awesome!");
			}
			// 6. If the random number is 1
			if (num == 1) {
				// -- tell the user whatever they entered is ok.
				JOptionPane.showMessageDialog(null, awesome + " is okay.");
			}
			// 7. If the random number is 2
			if (num == 2) {

				// -- tell the user whatever they entered is boring.
				JOptionPane.showMessageDialog(null, awesome + " is boring.");
			}
			// 8. If the random number is 3
			if (num == 3) {

				// -- write your own answer
				JOptionPane.showMessageDialog(null, awesome + " is the most boring thing.");
			}
		}
	}
}
