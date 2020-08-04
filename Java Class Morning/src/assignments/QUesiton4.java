package assignments;

import java.util.Scanner;

public class QUesiton4 {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Enter the Principle");
int p= input.nextInt();
System.out.println("Enter the time");
int t= input.nextInt();
System.out.println("Enter the rate");
int r= input.nextInt();
double interest = (double)(p*t*r)/100;
System.out.println(interest);

	}

}
