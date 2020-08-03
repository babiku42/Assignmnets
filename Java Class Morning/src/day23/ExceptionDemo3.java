package day23;

import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//resource class scanner pani ho jaslai last ma close garnu parxa 
		System.out.println("Enter number a:");
		int a = input.nextInt();
        System.out.println("Enter number b:");
        int b = input.nextInt();
        
        try {
        	System.out.println("try start ");
        	  int div = divide(a,b);
              System.out.println("division is:"+div);
              System.out.println("try end");
            }catch(ArithmeticException ae) {
        	System.out.println("inside catch");
        }finally {
        	//finally always runs: when to use :resource release close shut down garne   
        	System.out.println("inside finally block");
        }
        
        System.out.println("more code :");
        System.out.println("more and more code :");
        input.close();
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	}


