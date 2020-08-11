package day31;

public class ThreadTest {

	public static void main(String[] args) {
ThreadDemo6 fb= new ThreadDemo6(400);

Thread t1= new Thread(() -> {
	fb.increaselikes(); 
});
Thread t2= new Thread(() -> {
	fb.increaselikes();
	
});
Thread t3= new Thread(() ->{
	fb.increaselikes();
});
t1.start();
t2.start();
t3.start();

}

	

}
