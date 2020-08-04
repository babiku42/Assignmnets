package day17;

public class Derievd extends Base{
	String name= "chile";
	 public void sayHi() {
		 System.out.println(name);
		 System.out.println(super.name);
		 System.out.println("hi from child");
		 super.sayHi();
	 }

}
