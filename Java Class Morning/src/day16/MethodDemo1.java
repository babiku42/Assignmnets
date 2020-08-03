package day16;

public class MethodDemo1 {
public void sayHello() {
	System.out.println("hello from java !!");//0 arguments
}
public void greet(String name ) { //having arguments and there can be many numbers of arguments
	System.out.println("hello , "+name+ ",Good morning");
	}
public static String returnInfo() {
	String name = "Krishna thapa";
	String address = "Kathmandu ,Nepal";
	
	return name +" " +address;
}
public static int findMax(int a, int b) {
	int  max =0;
	if(a>b) {
		max = a;
	}else {
		max =b;
		
	}
	return max;
	}
public static void main(String[] args) {
	MethodDemo1 ob= new MethodDemo1();
	ob.sayHello();
	ob.greet("Trump");
	String r = MethodDemo1.returnInfo();
	System.out.println(r);
	int m = MethodDemo1.findMax(45,50);
	System.out.println(m);
}

}
