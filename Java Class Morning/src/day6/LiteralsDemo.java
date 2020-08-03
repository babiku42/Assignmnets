package day6;

public class LiteralsDemo {
	public static void main(String[] args) {
		// Literals => fixed value + data type

		// 1.Integer Literal 3432 4645 5465765676 23432565467 (int)
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l1 = 2147483647;
		long l2 = 2147483648L;

		// 2. floating Literal 45.67 243.436546 (double)
		float f = 23.45F; // forcefully compile by putting F at the end of 23.45 so program will compile
		double d = 34.56; // double will work to compile the system to read the number as a float number

		// 3. Boolean Literal True False
		boolean b1 = true;
		boolean b2 = false;
		
		/* 4. character literal '1' 'a' '/' '?' note: in single quote we cannot write more than one word
		 but there is one exception we can  write more than one notation like \u0000 , \u0001 \u000a */
		
		char c1 = '1';
		char c2 = 'a';
		char c3 = '?';
		char c4 = '\u0000';
		
		//5. String Literal "Nepal", "abc@12#34%a5" , "" , "  " ,
		String s1= "Nepal";
		String s2= " ";
		String s3= "123";
		String s4= "23.35";
		String s5= "a";
		String s7= "Hello I am Ocean kc From  Nepal. I am a civil Engineer and I live in North carolina ";
		
		//6.Null Literal null 
		String s8= null;
		LiteralsDemo ob = new LiteralsDemo(); /*  This is an object in Java ie.mathi ko class ma kei name diyara = to new 
		ani class diyo vane object banauna sakinxa */
		LiteralsDemo obb = null; // if there is no obejct or terminate object 
		// string is also a library class
		
		 
		
	}

}
