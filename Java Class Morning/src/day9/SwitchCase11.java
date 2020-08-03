package day9;

import java.util.Scanner;

public class SwitchCase11 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your choice :");
     char choice = input.next().charAt(0);

	switch(choice){
	case '+':
		System.out.println("This is addition:");
		break;
	case '-':
		System.out.println("This is substraction");
		break;
		case '*': 
			System.out.println("This is multiplication");
		break;
		case '/': 
			System.out.println("This is division");
		break;
	default:
		System.out.println("wrong choice ");
	}
	input.close();
	System.out.println("wrong choice ....");
	System.out.println("exit!!!");
}
}
