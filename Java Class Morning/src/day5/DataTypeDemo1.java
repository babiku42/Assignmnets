package day5;



public class DataTypeDemo1 {

	public static void main(String[] args) {
		byte b1 = 127; // max range
		byte b2 = -128;//min range
	
		short  s1 = 32767; //max range
		short s2 = -32768; //min range
		
		int i1 = 2147483647; //max range
		int i2 = -2147483648; //min range
		
		
	//	long l1 = 9223372036854775807; //max range
	//	long l2 = -9223372036854775808; //min range
	
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		System.out.println(Long.BYTES);
		
	}
}
