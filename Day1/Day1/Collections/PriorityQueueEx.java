package Day1.Collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> taskQueue = new PriorityQueue<String>();
		
		taskQueue.add("Ashok");
		taskQueue.add("Vimal");
		taskQueue.add("Negan");
		taskQueue.add("Mohan");
		taskQueue.add("Ravi");
		
		while(!taskQueue.isEmpty()) {
			System.out.println("Processing with task priority : " + taskQueue.poll());
		}
	}

}
