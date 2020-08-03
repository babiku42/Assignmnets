package day9;
import java.util.Scanner;

public class switchcase22 {
public static void main(String[] args) {
			
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice :");
	 String choice = input.next();

		switch(choice){
		case "add":
			System.out.println("This is addition:");
			break;
		case "sub":
			System.out.println("This is substraction");
			break;
			case "mul": 
				System.out.println("This is multiplication");
			break;
			case "div": 
				System.out.println("This is division");
			break;
		default:
			System.out.println("wrong choice ");
		}
		input.close();
		System.out.println("more code....");
		System.out.println("exit!!!");
	}
	}


