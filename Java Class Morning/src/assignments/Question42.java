package assignments;

import java.util.Scanner;

public class Question42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the long string");
		int count;
		String name = input.nextLine();
		name = name.toLowerCase();

		String[] words = name.split(" ");
		int l = words.length;
		System.out.println("The repeated words are");
		for (int i = 0; i < l; i++) {
			count = 1;
			for (int j = 1 + i; j < l; j++) {
				if (words[i].equals(words[j]) && !words[i].equals(" ")) {
					count++;
					words[j] = "0";

				}

			}

			if (count > 1 && !words[i].equals("0")) {
				System.out.println(words[i]);
			}

		}
		input.close();
	}
}
