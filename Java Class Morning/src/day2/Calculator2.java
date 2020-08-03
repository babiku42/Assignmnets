package day2;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = input.nextInt();
		System.out.println("Enter number 2:");
		int b = input.nextInt();

		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		
		System.out.println("sum of "+a+" and "+b+" is :" +sum);
		System.out.println("substraction of "+a+" and  "+b+" is:" +sub);
        System.out.println("multiplication of "+a+" and "+b+" is :" +mul);
        System.out.println("division of "+a+" and "+b+" is:" +div);
        
        input.close();

	}

}

