package day11;

import java.util.Scanner;

public class MethodDemo2 { //string ra int yesma arguments ho ani last ma value return garda ni sameform ma return garnu parca 
	public void PrintInfo(String name, int age ) {//void with argument vanxa yeslai
		System.out.println("name is"+name );
		System.out.println("age is"+age);
		
	}
	public static void main(String[] args) {
		MethodDemo2 ob = new MethodDemo2();
		ob.PrintInfo("ram", 22);
		Scanner input = new Scanner (System.in);
		System.out.println("enter name :");
		String name = input.nextLine();
		System.out.println("enter the age :");
		int age = input.nextInt();
		 ob.PrintInfo(name, age);
		 input.close(); 
	}

}
