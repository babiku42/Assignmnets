package day21;

public class StringDemo1 {
//string is library class situated in java.lang package
	public static void main(String[] args) {
		
	//Implicitly
	String s1= "Hello";
	System.out.println(s1);
	//explicitly
	String s2= new String();
	System.out.println(s2);
	
	String s3= new String("hello");
	System.out.println(s3);
	
	char[] ch= {'a', 'b','c'};
	String s4= new String(ch);
	System.out.println(s4);
	
	byte [] bb= {65,65,66};
	String s5= new String(bb);
	System.out.println(s5);
}}
 