package day23;

public class ExceptionDemo8 {
	public static void main(String[] args) {
		vote(13);
		System.out.println("end");
		
	}
	public static void vote(int age) {
		if(age>=18) {
			System.out.println("you can vote....");
		}else {
			//throw new ArithmeticException("you cannot vote.......");
			throw new InvalidAgeException("you cannot vote...."); // afai le exception create garna sakinxa 
		}
	}

}
