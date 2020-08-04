package day22;

public class StringDemo4 {

	public static void main(String[] args) {
String s1= "Good Morning";
System.out.println(s1.substring(5));
System.out.println(s1.substring(0,4));
System.out.println(s1.charAt(3));
System.out.println(s1.indexOf("d"));
System.out.println(s1.contains("r"));
System.out.println(s1.contains("Morning"));
System.out.println(s1.length());
System.out.println(s1.isEmpty());
System.out.println(s1.concat("Hello"));
System.out.println("HEllo".concat(s1));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());


char[] ch = s1.toCharArray();
System.out.println(ch[2]);


System.out.println(s1.replace("MOrning", "Evening"));

String s2= " BIkash Adhikari ";
System.out.println((s2.trim()));

if(s1.compareTo("Good Morning")==0) {
	System.out.println("Both String are equals");
	
}
else {
	System.out.println("Both strings are not equals");
}

	}

}
