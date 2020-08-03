package assignments;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		int [] ar= new int[] {1,2,3,5,6};
	for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
	}
	System.out.println();
	for (int i=ar.length-1; i>=0; i--) {
		System.out.println(ar[i]);
	}
	}
}
	

	/*int	rev=0;
Scanner input = new Scanner(System.in);
System.out.println("enter the limit of the number");
int l= input.nextInt();
int [] ar= new int[l];
for (int i= 0; i<ar.length; i++) {
	System.out.println("enter the numbers");
	ar[i]= input.nextInt();
	System.out.println(ar[i]);
	
	
}
input.close();
System.out.println();
for (int i= ar.length; i>=0;i--) {
	System.out.println(ar[i]);

}


	}

}
*/
		