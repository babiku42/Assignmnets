package assignments;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		String decision = "";
		Scanner input = new Scanner(System.in);
		

		do {
			System.out.println("enter the size of the element");
			int size = input.nextInt();
		int[] ar = new int[size];
		if (size ==5 ) {
			int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			
			 System.out.println("enter the element");
					ar[i] = input.nextInt();
					sum = sum + ar[i];
			}
					System.out.println("the sum  of the given number is" + sum);
				
		}else {
				
			 
				System.out.println("Number must equals 5");

		}
				System.out.println("do you want to try again ?  press y/Y to continue");
				decision = input.next();
			
}
	
		while (decision.equalsIgnoreCase("y"));
		System.out.println("Thank you see you");
		
		input.close();
	}


}
