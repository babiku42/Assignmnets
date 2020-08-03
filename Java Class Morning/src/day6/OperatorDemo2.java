package day6;

public class OperatorDemo2 {
	public static void main(String[] args) {
		// Assignment Operator = += -= *= /= %= = bahek sabai compound operator haru hun
		// Assosiativity : Right to left hunxa
		int a = 45 + 5 - 4 / 2 - 7 % 2 - 2 * 3; // yesma right ko value executehunxa direct memory adress ma gayera save
												// hunxa
		System.out.println(a);

		int x = 5;
		System.out.println(x);
		x = x + 2; // x += 2; // same out put aauxa same expression  ie compound operator or shorthand operator
		System.out.println(x);
		
		

	}
}
