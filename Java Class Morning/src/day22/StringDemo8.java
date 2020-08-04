package day22;

public class StringDemo8 {

	public static void main(String[] args) {
System.out.println(isTrue("True"));
System.out.println(isTrueorYes("True"));
//System.out.printlnisEmail("babiku@gmail.com")();
	}
public static boolean isTrue(String s) {
	return s.matches("true|True");
	
	
	
}
public static boolean isTrueorYes(String s) {
	return s.matches("true|True|Yes");
}

//search regex
public static boolean isEmail(String s) {
	return s.matches(" ");
}}