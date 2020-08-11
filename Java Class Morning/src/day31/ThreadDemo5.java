package day31;

public class ThreadDemo5 extends Thread {
	String value;
	public ThreadDemo5(String value) {
		this.value= value;
		
	}
	

	public String getValue() {
		return value;
	}
public void run() {
	System.out.println(getValue()+" "+ currentThread().getPriority());
	
}




	public static void main(String[] args) {
ThreadDemo5 t= new ThreadDemo5("t");
ThreadDemo5 t1= new ThreadDemo5("t1");
ThreadDemo5 t2= new ThreadDemo5("t2");

System.out.println(Thread.MAX_PRIORITY);
System.out.println(Thread.MIN_PRIORITY);
System.out.println(Thread.NORM_PRIORITY);

t.start();
t1.start();
t2.start();





	}

}
