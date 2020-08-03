package assignments;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		int l1=0;
		int l2=0;
		int temp;
Scanner input = new Scanner (System.in);
System.out.println("enter the size ");
int size = input.nextInt();
int [] arr= new int[size];
for (int i= 0; i<arr.length; i++) {
	System.out.println("enter the elements");
	arr[i]= input.nextInt();
}
for (int i = 0; i<arr.length;i++ ) {
	System.out.println(arr[i]);
}
 l1= arr[0];
 l2 =arr[1];
if (l2>l1) {
 temp= l1;
	l1=l2;
	l2=temp;
	
}
for (int i=2; i<arr.length; i++) {
	if (arr[i] >l1) {
		l2=l1;
		l1=arr[i];
	}else if (arr[i]>l2 && arr[i]<l1) {
		l2= arr[i];
	}
}
System.out.println("the  second largest number in the array is " +l2);
input.close();
	}

}
