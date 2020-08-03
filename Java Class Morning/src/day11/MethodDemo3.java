package day11;

import java.util.Scanner;

public class MethodDemo3 {
	public static int sum() {// static rakhyo vanye object create garnu pardaina 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st value :");
		int a = input.nextInt();
		System.out.println("Enter 2nd value :");
		int b = input.nextInt();

		int sum = a + b;
		return sum;
			
	}
	
	public static void main(String[] args) {
		int result = sum();//direct sum lai call gareko object nabanai 
		System.out.println("The sum is :"+result);
		
	}


}
