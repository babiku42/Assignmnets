package day11;

import java.util.Scanner;

public class BankDeposit {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("enter the customer name:");
	String name = input.nextLine();
	System.out.println("enter the bank balance");
	double amount = input.nextDouble();
	input.nextLine();
	System.out.println("do you want to deposit into your account?");
	String descision = input.nextLine();
	if(descision.equalsIgnoreCase("yes")) { //case sensitive lower case and uppercase
		System.out.println("Enter the deposit amount :");
	 double deposit = input.nextDouble();
	 amount = amount + deposit;
	}
	else{
		System.out.println("do you want to withdraw the money:");
		String descision1 = input.nextLine();
		
		if(descision1.equalsIgnoreCase("yes")) {
		System.out.println("Enter the withdraw amount :");
		double withdraw =input.nextDouble();
		amount = amount - withdraw;
		
		}
		else {
		
			System.out.println("Thamk you for visiting our bank!!!!");
		}
		
}input.close();
System.out.println("your current bank balance is :"+amount);
}
}
