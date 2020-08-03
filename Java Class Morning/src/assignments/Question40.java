package assignments;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = input.nextLine();
		/*
		 * StringBuilder s= new StringBuilder(word); s.reverse(); System.out.println(s);
		 */
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));

		}
		input.close();
	}

}
