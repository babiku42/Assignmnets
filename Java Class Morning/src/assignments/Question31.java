package assignments;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size");
		int size = input.nextInt();
		for (int i = 1; i < size; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();

		}
		input.close();
	}

}
