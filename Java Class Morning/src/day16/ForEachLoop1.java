package day16;

public class ForEachLoop1 {
public static void main(String[] args) {
	int [] arr = {2,3,4,12,67};
	for (int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("******************************************");
	for(int a:arr) { // array ko lagi mathi ko process nagari yo direct garna sakinxa 
		System.out.println(a);
	}
}
}
