package day23;//jun code ma error  hudaina tara runtime ma error hunxa ,,may be user ko interaction ma  ,,certain input
//input parameter namilera exception aauxa ,,teslai solve garna sakinxa ra teslai exception handling vaninxa
import java.util.Scanner;//yo program error dekhako 

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExceptionDemo1 ob = new ExceptionDemo1();
	   int div = ob.divide(input);
		/*System.out.println("Enter a:");
		int a = input.nextInt(); //if i put a =4 and put b = 0 or asadasd any alphabet
		System.out.println("Enter b:");//then there shows the exception error
		int b = input.nextInt();
		int div = a / b;*/
		System.out.println("dividsion is :"+div);
		input.close();
	}
	public int divide(Scanner input) {
		System.out.println("Enter a:");
		int a = input.nextInt(); 
		System.out.println("Enter b:");
		int b = input.nextInt();
		int div = a / b;
		return div;
	}

}
