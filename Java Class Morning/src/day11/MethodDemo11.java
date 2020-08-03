package day11;

public class MethodDemo11 {
	
//method declaration
	public void sayHello() { //void with no argument method //void euta type ho jasle kunai value lidaina 
System.out.println("Hello From Nepal!!");//2nd ma yo run hunxa

}
	public static void main(String[] args) {//java ma first ma main method matra run hunxa
		System.out.println("main start");//1st ma yo run hunxa 
		//object creation
MethodDemo11 ob = new MethodDemo11();
ob.sayHello();//Method calling //yesle mathi ko hello from nepal run garxa 
System.out.println("main end");//last m ayo run hunxa
		
	}
}