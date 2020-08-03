package day16;

import java.util.Scanner;

public class MethodDemo3 {

		// public static void sortArray(int[] arr) {
		public static void sumOfArrayElement(int... arr) {//yaha aru argument aayo vane
			//yo int... arr last ma aaunu parxa ani 2 ta banauna mildaina 
			//mostly sorting ascending descending ma useful hunxa 
			int sum = 0;
			for (int a : arr) {
				sum = sum + a;
				}
System.out.println("sum of array element is:"+sum);

		}
		public static void main(String[] args) {
			int[] arr = {2,3,4};
			MethodDemo3.sumOfArrayElement(arr);
			
			int[] ar = MethodDemo2.returnArray(new Scanner(System.in));
			MethodDemo3.sumOfArrayElement(ar);
			
			MethodDemo3.sumOfArrayElement(new int[] {4,5,6});
			
		MethodDemo3.sumOfArrayElement(9,5,6);//var args ie variable arguments
		}
	}
