package assignments;

import java.util.Scanner;

public class assignment43 {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter a");
int a= input.nextInt();
System.out.println("Enter b");
int b= input.nextInt();
String [] arr= {"a","b","c"};
try {
	System.out.println(a/b);
	
}catch(ArithmeticException  ae) {
	ae.printStackTrace();
	
}
try {
System.out.println(arr[4]);

}catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
}
finally {
	input.close();
}
	}

}
