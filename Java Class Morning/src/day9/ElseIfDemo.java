package day9;

public class ElseIfDemo {
	public static void main(String[] args) {
		int marks = 45;
		if (marks < 0 || marks >= 101) {
			System.out.println("invalid marks :");
			
		}else if(marks >=80 && marks <= 100) {
			System.out.println("distinction");
			
		}else if(marks >= 65 && marks <=79) {
			System.out.println("first division");
		}else if (marks >= 59 && marks <=65) {
			System.out.println("second Division");
		}
		else {
			System.out.println("fail");
		}
		System.out.println("more code");
		System.out.println("exit!!!");
	}

}
