package assignments;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = input.next();
		int count;
		char[] ch = word.toCharArray();
		System.out.println("The required repeated characters are");
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = 1 + i; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = 0;
				}
			}
			if (count > 1 && ch[i] != 0) {
				System.out.println(ch[i]);
			}

		}
		input.close();
	}

}
