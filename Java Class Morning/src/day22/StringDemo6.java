package day22;

public class StringDemo6 {

	
	public static void main(String[] args) {
		String intro= "I am, BIkash Adhikari, form Pokhara Nepal. I am Senior Java Developer, student as well as Java Instructor";
		String[] words= intro.split(" ");
		for(String w:words) {
			System.out.println(w);
		}
		System.out.println("======================");
words= intro.split(",");
for(String w:words) {
System.out.println(w);

	}
	
}
}