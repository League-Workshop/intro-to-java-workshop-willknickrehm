package section3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "what's your name?");
	JOptionPane.showMessageDialog(null,"hi, " + name);
	}
}
