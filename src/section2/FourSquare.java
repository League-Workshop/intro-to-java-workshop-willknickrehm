package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a
	Robot wallie = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		wallie.setSpeed(200);
		// 5. Set the pen width to 5
		wallie.penDown();
		wallie.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
wallie.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
	
		wallie.turn(90);}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			wallie.move(200);
			wallie.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
