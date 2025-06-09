package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TicketBooking implements Runnable {

	private String passengerName;
	
	
	public TicketBooking(String passengerName) {
		super();
		this.passengerName = passengerName;
	}
	@Override
	public void run() {
		System.out.println(passengerName + " booked a ticket using " + Thread.currentThread().getName());
		
	}
	
}
public class TicketSystem {
	
	public static void main(String[] args) {
		
		 ExecutorService executor = Executors.newFixedThreadPool(2);
		 
		 // pool resues the thread instead of creating new one
		 
		 
		executor.execute(new TicketBooking("Alice"));
		executor.execute(new TicketBooking("Bob"));
		executor.execute(new TicketBooking("Charlie"));
		executor.execute(new TicketBooking("Thomas"));
		
		executor.shutdown();
		
	}

}
