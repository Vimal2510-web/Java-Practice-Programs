package Threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// manages producer consumer operations without manual synchronisation

class Producer implements Runnable{

	
	private final BlockingQueue<Integer> queue;
	
	Producer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Produced : " +i);
				queue.put(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}	
}

class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;
	
	Consumer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			while(true) {
				Integer item = queue.take();
				System.out.println("Consumed : " + item);
				Thread.sleep(1500);
				
			}
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}
	
}

public class ProducerConsumer {
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}
	
	

}
