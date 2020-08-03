package day16;



public class MethodDemo4 {//sometime in interview they ask which one is valid ,,,
	//they are all valid
	
	/*}
	public static void main(String... args) {
		
	}
	public static void main(String args[]) {
		
	}	public static void main(String... ar) {
		
	}
		
	}*/

	public static void main(String[] args) {
		String [ ] nameList = {"ram" , "shyam", "hari"};
		MethodDemo4.printNameList(nameList);
	}
	public static void printNameList(String[] args) {
	for (int i =0; i<args.length;i++) {
		System.out.println(args[i]);
	}
		
	}
}
