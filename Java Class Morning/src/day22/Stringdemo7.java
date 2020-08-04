package day22;

import java.util.StringTokenizer;

public class Stringdemo7 {

	public static void main(String[] args) {
		String intro= "I am, BIkash Adhikari,,form Pokhara Nepal. I am Senior Java Developer,, student as well as Java Instructor";
		String[] words= intro.split(",");
		System.out.println(words.length);

		for(String w:words) {
			System.out.println(w);
		}
		StringTokenizer st= new StringTokenizer(intro,",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
			
			
		}
	}

}
//counts extra comma also
