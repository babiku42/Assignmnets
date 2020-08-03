package day6;

public class OperatorDemo3 {
	public static void main(String[] args) {
		int a = 5;
		// Increment/Decrement Operator
		// ++ -- //i++ = 5 tara ++i= 6 post ma paile operation paxi increment tara pre
		// ma paile increment paxi operation
		// post a++ a-- //a=5 a++yesma a ko value 5 nai hunxa tara paxi ++ le garda a=6
		// hunxa nextkunai a ko expression ma a=6
		// pre ++a --a // a=5 --a yesma paile -- le ghatai dinxa ani value of a 4 hunxa
		System.out.println(a);
		a++;
		System.out.println(a);

		int x = 4;
		System.out.println(x); // 4
		System.out.println(x++); // 4
		System.out.println(x); // 5

		int m = 5;
		int n = m++; // paile operation vayo ie n=m vayo tara ++ paxi increment vayo ani m ko value
						// increase vayo
		System.out.println(m); // 6
		System.out.println(n); // 5

		int i = 5;
		i = (i++) + (++i) + i + 1; // i++=5 but i=6  and ++i= 7 and i=7 +1 => 5+7+7+1=20
		System.out.println(i);
		
	}

}
