package day28;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo1 {

	public static void main(String[] args) {
int[] ar= {16,3,4,5};
System.out.println(ar);
for(int a:ar) {
	System.out.print(a+ " ");
	
}
System.out.println();

System.out.println(Arrays.toString(ar));
Arrays.sort(ar);
System.out.println(Arrays.toString(ar));
System.out.println();
int[] arr= Arrays.copyOf(ar, 4);
System.out.println(Arrays.toString(arr));
System.out.println();
List<Integer>l= Arrays.asList(1,212,14,1111,5,5,6,7);
System.out.println(l);
Collections.sort(l);
System.out.println(l);
System.out.println();
	}

}
