package day31;

public class ThreadDemo6 extends Thread{
	private int likes;
	public ThreadDemo6(int likes) {
		this.likes= likes;
		
	}
	public int getLikes() {
		return likes;
	}
	public  synchronized void increaselikes() {
		likes++;
		try {
			Thread.sleep(1000);
			System.out.println(likes);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
