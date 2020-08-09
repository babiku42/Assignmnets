package day30;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
Thread2 t1= new Thread2();
Thread t= new Thread(t1);
Thread2 t2= new Thread2();
Thread tt1= new Thread(t2);
Thread2 t3= new Thread2();
Thread t4= new Thread(t3);
t.start();
tt1.start();
t4.start();


	}

	@Override
	public void run() {
		System.out.println("Hello there");
		
	}

}
