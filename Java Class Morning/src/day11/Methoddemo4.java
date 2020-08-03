package day11;

import java.util.Scanner;

public class Methoddemo4 {
	public static int findMax(int a, int b) {
		int max = 0;
		
		if (a > b) {
			max = a;

		} else {
			max = b;
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		int m = findMax(4, 5);
		System.out.println("max number is :" + m);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st value :");
		int a = input.nextInt();
		System.out.println("Enter 2nd value :");
		int b = input.nextInt();
		int result = findMax(a,b);
		System.out.println("The maximum value is :"+result);
		input.close();	
	}
	

}
