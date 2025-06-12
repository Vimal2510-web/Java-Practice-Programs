package Threads;

// Multi threaded order processing system

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

class Order {
	
	private final int orderId;
	private final String customer;
	Order(int orderId, String customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
	}
	
	public int getorderId() {
		return orderId;
	}
	
	public String getcustomer() {
		return customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + "]";
	}	
}

class OrderProducer implements Runnable{
	
	private final BlockingQueue<Order> OrderQueue;
	private final int orderToProduce;
	
	OrderProducer(BlockingQueue<Order> orderQueue, int orderToProduce) {
		super();
		OrderQueue = orderQueue;
		this.orderToProduce = orderToProduce;
	}
	@Override
	public void run() {
		for(int i=1;i<= orderToProduce;i++) {
			Order order = new Order(i,"Customer" + i);
			
			try {
				OrderQueue.put(order);
				System.out.println("Produce : " + order);
				Thread.sleep(500);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	
	}
	
}

class OrderConsumer implements Runnable{
	
	private final BlockingQueue<Order> OrderQueue;
	
	OrderConsumer(BlockingQueue<Order> orderQueue) {
		super();
		OrderQueue = orderQueue;
	}

	@Override
	public void run() {
		
		try {
			while(true) {
				
				Order order = OrderQueue.take();
				System.out.println(Thread.currentThread().getName()+" processed " + order);
				Thread.sleep(800);
			}
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}	
	}	
}
public class OrderProcessingSystem {
	
	public static void main(String[] args) {
		
		BlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>(10);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		// Start one producer thread that starts 10 orders
		executor.submit(new OrderProducer(orderQueue,10));
		
		// Start 2 consumer thread to process orders
		
		executor.submit(new OrderConsumer(orderQueue));
		executor.submit(new OrderConsumer(orderQueue));
		
		// let the system run for 10 seconds and shutdown
		
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();  
		}
		
		executor.shutdownNow();
		System.out.println("Order processing system stopped");
		
	}

}
