package day16;//enhanced for loop vanxa 

public class ForEachLoopDemo2 {// multi dimensional array vaneko array vitra arko array or fake array pani vanxa
								
	public static void main(String[] args) {
		int[][] arr = { { 2, 3, 4 }, { 5, 4, 7 }, { 8, 9, 4 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.println(a + " ");
			}
			System.out.println();
		}
	}

}
