package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot a3 = new Robot();
		a3.miniaturize();
		// 3. Put the robot's pen down
		a3.penDown();
		// 8. Make the robot go at maximum speed (10)
a3.setSpeed(200);
		// 9. Set the pen to a color that you like for the shape

		// 4. Make a variable for the number of sides you want (can’t test this one)
		int numsides = 5;
		// 5. Make a second variable for the angle you want the robot to turn. Hint: you
		// can divide in Java using "/". Can’t test until step 6
		int angle = 360 / numsides;
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you
		// should see a pentagon
		for (int i = 0; i < 20000; i++) {
			// 2. Move the robot 200 pixels
			a3.move(i);
			a3.setRandomPenColor();
			// 10. Change the previous line of code to make the robot move "i" pixels
			// instead of 200

			// 6. Turn the robot the amount in your angle variable
			a3.turn(angle);
			// 11. Turn the robot one more degree
a3.turn(1);
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}