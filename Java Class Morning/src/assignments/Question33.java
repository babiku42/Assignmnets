 package assignments;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		int temp=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number size");
		int l = input.nextInt();
		int[] arr= new int[l];


		for ( int i=0; i<arr.length; i++) {
			System.out.println("enter the numbers");
			arr[i]= input.nextInt();
			

		}
input.close();
for (int i= 0; i<arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if( arr[i]>arr[j]){
			temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
		} 
	}
}
System.out.println("the requried numbers in ascending orders are");
for (int i= 0; i<arr.length; i++) {
	System.out.println((arr[i]+  " "));
	
	
}

	}
}

