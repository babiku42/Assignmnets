package day16;//2 dimnesion array vaneko array of array

public class ZaggedArrayDemo {//run time ma decide 
	public static void main(String[] args) {
		

	int [][] arr = new int [3][];   //row fixed tara column fix hudaina 
	arr[0] = new int [1];
	arr[0][0]= 10;
	
	arr[1]= new int [2];
	arr[1][0]= 10;
	arr[1][1]= 20;
	
	arr [2] =new int [3];
	arr[2][0]= 10;
	arr[2][1]= 20;
	arr[2][2]= 30;
	for (int i =0; i<arr.length;i++) {
		for(int j = 0;j<arr[i].length;j++) {
			System.out.println(arr [i][j] +" ");
			
		}
		System.out.println();
		
	}
	System.out.println("=============");
	for(int[] ar : arr) {
		for(int a:ar) {
			System.out.println(a +" ");
		}
		System.out.println();
	}
	
}
}