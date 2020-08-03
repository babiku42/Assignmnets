package day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] arr = new int[2];
        try {
    		System.out.println("Enter number a:");
    		int a = input.nextInt();
            System.out.println("Enter number b:");
            int b = input.nextInt();
            
        	System.out.println("try start ");
        	  int div = divide(a,b);
              System.out.println("division is:"+div);
              System.out.println(arr[2]);//array index out of bond error
              System.out.println("try end");
              //if there is input mismatched and we donot know what kind of exception error is that then used
            }catch(ArithmeticException | InputMismatchException ae) {//same level ko vayo vane yesari lekhna sakinxa
            	
            ae.printStackTrace();
          
           }catch(Exception e) {//yo parent exception ho yo last ma hunu parxa ie multilevel catch 
           	System.out.println(e);//kna vane exception le sabai type ko error handle gardinaxa ani exit hunxa 
        }finally {
        	//finally always runs: when to use :resource release close shut down garne   
        	System.out.println("inside finally block");
        	input.close();
        }
        
        System.out.println("more code :");
        System.out.println("more and more code :");
        
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
