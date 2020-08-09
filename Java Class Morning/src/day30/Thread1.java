package day30;

public class Thread1 extends Thread{


	public static void main(String[] args) {
Thread1 t1= new Thread1();
Thread1 t2= new Thread1();
Thread1 t3= new Thread1();
t1.start();
t2.start();
t3.start();


	}
public void run () {
	System.out.println("Hello There");
}
}
