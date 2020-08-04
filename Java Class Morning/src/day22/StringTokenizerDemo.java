package day22;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String intro= "I am, BIkash Adhikari, form Pokhara Nepal. I am Senior Java Developer, student as well as Java Instructor";
	StringTokenizer st= new StringTokenizer(intro);
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		
		
		
	}
	System.out.println("=================================");
	st= new StringTokenizer(intro, ",");
	while(st.hasMoreElements()) {
		System.out.println(st.nextElement());
		
	
	}

}
}