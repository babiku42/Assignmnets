package day17;

public class Test1 {

	public static void main(String[] args) {
Parent obj= new Parent();
obj.sayHello();

System.out.println(obj.name);


Child child= new Child();
child.sayHello();
System.out.println(child.name);
	}

}
