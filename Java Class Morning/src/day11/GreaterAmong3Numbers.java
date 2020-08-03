package day11;

import java.util.Scanner;

public class GreaterAmong3Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter 1st numbers :");
		double a = input.nextDouble();
		System.out.println("enter 2nd numbers :");
		double b = input.nextDouble();
		System.out.println("enter 3rd numbers :");
		double c = input.nextDouble();
		input.close();
		GreaterAmong3Numbers ob = new GreaterAmong3Numbers();
		ob.comparison(a, b, c);
	}
	
 public  void comparison(double a, double b, double c) {
	if (a>b && a>c) {
		System.out.println(a+ " is greatest");
	}else if (b>a) {
System.out.println(b + "is greatest");
}else { 
	System.out.println(c+ " is greatest");
}
 }
 }