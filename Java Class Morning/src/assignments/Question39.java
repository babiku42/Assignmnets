package assignments;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = input.nextLine();
		String[] w = name.split(" ");
		for (int i = 0; i < w.length - 1; i++) {
			System.out.print(w[i].charAt(0) + " ");

		}
		System.out.println(w[w.length - 1]);

		input.close();
	}

}
