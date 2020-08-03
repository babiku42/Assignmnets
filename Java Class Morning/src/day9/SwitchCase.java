package day9;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice :");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("This is addition:");
			break;
		case 2:
			System.out.println("This is substraction");
			break;
			case 3: 
				System.out.println("This is multiplication");
			break;
			case 4: 
				System.out.println("This is division");
			break;
		default:
			System.out.println("wrong choice ");
		}
	input.close();
	}
}
