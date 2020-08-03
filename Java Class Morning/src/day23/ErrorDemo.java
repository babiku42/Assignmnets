package day23;

public class ErrorDemo {//exception handle garna sakinxa tara error handle garna sakinna
public static void main(String[] args) {
	try {
		int [] arr = new int[1000000];
	}catch(Exception e){
		System.out.println("inside catch");
		e.printStackTrace();
	}
	System.out.println("end");
}
}
//checked error vaneko compile time error 
//runtime error vaneko runtime ma aaune error