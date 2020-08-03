package assignments;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = input.next();
		StringBuilder s = new StringBuilder(word);
		s.reverse();
		System.out.println(s);
		if (word.equals(String.valueOf(s))) {
			System.out.println("Its a palindrom");
		} else {
			System.out.println("Its not a palindrome");

		}
		input.close();
	}

}
