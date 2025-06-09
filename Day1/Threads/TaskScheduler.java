package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskScheduler {
	
	public static void main(String[] args) {
		
		ExecutorService executors = Executors.newFixedThreadPool(4);
		
		Runnable task1 = ()-> System.out.println("Task 1 done by : " + Thread.currentThread().getName());
		Runnable task2 = ()-> System.out.println("Task 2 done by : " + Thread.currentThread().getName());
		Runnable task3 = ()-> System.out.println("Task 3 done by : " + Thread.currentThread().getName());
		Runnable task4 = ()-> System.out.println("Task 4 done by : " + Thread.currentThread().getName());
	
		executors.execute(task1);
		executors.execute(task2);
		executors.execute(task3);
		executors.execute(task4);
		
		executors.shutdown();
	}
	


}
