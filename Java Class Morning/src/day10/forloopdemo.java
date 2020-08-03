package day10;

import java.util.Scanner;

public class forloopdemo {
	public static void main(String[] args) {
//for (initialization;condition;update(increment/decrement)) {  //instance variablle 
	//}															// int a;
Scanner input = new Scanner (System.in);						// ForLoopDemo ob = new ForLoopDemo()
System.out.println("Enter number :");                           //sout(ob.a);
int n = input.nextInt();
int sum = 0;//local variable sum ho ani yesma value initialize garnu parxa
for (int i = 1; i<=n ; i++) {
	sum = sum + i;

	System.out.println(i);	
}
System.out.println("sum is :"+sum);
input.close();
}
	}