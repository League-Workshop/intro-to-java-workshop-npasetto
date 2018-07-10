package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot turtle = new Robot();
		// 5. Set your robot's pen down 
		turtle.penDown();
		// 3. Set the robot to go at max speed (100)
		turtle.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 125; i++) {
			
		
			// 7. Change the pen color to random
		turtle.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			turtle.move(i/3);
			// 2. Turn the robot 360/7 degrees to the right
		turtle.turn(10);
			// 8. Set the pen width to i
		turtle.setPenWidth(i/5);
		}
	}
}
