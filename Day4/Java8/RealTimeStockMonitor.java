package Java8;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class RealTimeStockMonitor {
	
	public static void main(String[] args) {
		
		// Scheduled executor to run task at fixed rate
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		// Supplier simulate the stock price updates(random price btwn 100 and 150)
		Supplier<Double> stockPriceSupplier = () -> {
			double price =100+ Math.random() * 50;
			return Math.round(price * 100.0) / 100.0;
		};
		
		// Task fetches and print the current stock price
		
		Runnable priceUpdateTask = () -> {
			double price = stockPriceSupplier.get();
			System.out.println("Updated stock price : " + price);
		};
		
		// schedule the task to run every second
		
		scheduler.scheduleAtFixedRate(priceUpdateTask, 0, 0, TimeUnit.SECONDS);
		
		// let the task to run for 10 seconds and stop
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		scheduler.shutdown();
		System.out.println("Stock price monitoring stopped"); 
	}	

}
