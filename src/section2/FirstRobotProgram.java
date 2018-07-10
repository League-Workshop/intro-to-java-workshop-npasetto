package section2;

import org.jointheleague.graphical.robot.Robot;

public class FirstRobotProgram {
	
	public static void main(String[] args) {
		Robot turtle = new Robot();
		turtle.miniaturize();
		turtle.penDown();
		turtle.setRandomPenColor();
		
		for (int i = 0; i < 8; i++) {
			turtle.move(72);
			turtle.turn(135);
		}
		
		
	}

}

