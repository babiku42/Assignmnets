package day2;

import javax.swing.JOptionPane;

public class Calculator3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2:"));

		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;

		JOptionPane.showMessageDialog(null, "sum is: " + sum);
		JOptionPane.showMessageDialog(null, "subtraction is: " + sub);
		JOptionPane.showMessageDialog(null, "multiplication is: " + mul);
		JOptionPane.showMessageDialog(null, "division  is: " + div);
	}

}
