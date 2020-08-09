package day30;

public class Thread3 {

	public static void main(String[] args) {
Thread t= new Thread(new Runnable() {

	@Override
	public void run() {
System.out.println("Hello There");		
	}
	
	
});
Thread t1= new Thread(()-> System.out.println("Hi hero"));
t.start();
t1.start();	}

}
