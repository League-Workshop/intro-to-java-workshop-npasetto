package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot turtle = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
turtle.setSpeed(100);
turtle.penDown();
		// 5. Set the pen width to 5
turtle.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	turtle.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
		turtle.turn(90);
}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
			for (int i = 0; i < 4; i++) {
				turtle.move(50);
				turtle.turn(90);
			}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



