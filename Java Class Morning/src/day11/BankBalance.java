package day11;

import java.util.Scanner;

public class BankBalance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter name of customer:");
		String name = input.nextLine();

		System.out.println("enter balance:");
		double amount = input.nextDouble();

		System.out.println("enter deposited amount:");
		double deposit = input.nextDouble();

		System.out.println("enter withdraw amount:");
		double withdraw = input.nextDouble();

		System.out.println("the amount in bank is :" + amount);

		amount = bankBalance(amount, deposit);

		System.out.println("the bank balance after deposit is:" + amount);
		System.out.println("The amount in bank is :" + amount);
		amount = bankWithdraw(amount, withdraw);
		

		System.out.println("The amount after withdraw is: " + amount);

	}

	public static double bankBalance(double amount, double deposit) {

		amount = amount + deposit;
		return amount;

	}

	public static double bankWithdraw(double amount, double withdraw) {
		amount = amount - withdraw;
		return amount;
	}
}