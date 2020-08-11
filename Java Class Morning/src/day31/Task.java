package day31;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task  implements Runnable {

	private String name;
	public Task(String name) {
		this.name= name;
		
	}
	public String getName() {
		return name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 5 ; i++) {
			System.out.println(i + " "+ this.getName());
			
		}
	}
	public static void main(String[] args) {
ExecutorService exService = Executors.newFixedThreadPool(4);
exService.execute(new Task("Task1"));
exService.execute(new Task("Task2"));
exService.execute(new Task("Task3"));
exService.execute(new Task("Task4"));
exService.isShutdown();
 

	}

}
