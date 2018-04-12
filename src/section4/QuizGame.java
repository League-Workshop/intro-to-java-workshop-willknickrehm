package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String two = JOptionPane.showInputDialog(null, "what's 1+1?");
		// 3.  Use an if statement to check if their answer is correct
		if(two.equals("two")) {
		// 4.  if the user's answer is correct
		//this code runs if
			//two is equal to two
		// -- add one to their score 
		score = score + 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String twohundred = JOptionPane.showInputDialog(null, "what's 100 + 100?");	
		if(twohundred.equals("twohundred")) {
			//this code runs if
			//twohundred is equal to twohundred
			score = score + 1;
		}

		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, " score " + score);

}

}
