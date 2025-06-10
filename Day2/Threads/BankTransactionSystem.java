package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BankTransaction implements Runnable{
	
	private final String transactionType;

	public BankTransaction(String transactionType) {
		super();
		this.transactionType = transactionType;
	}

	@Override
	public void run() {
		System.out.println(transactionType + "processed in " + Thread.currentThread().getName());
		
	}
	
}

public class BankTransactionSystem {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.execute(new BankTransaction("Deposit "));
		executor.execute(new BankTransaction("Withdrawl "));
		executor.execute(new BankTransaction("Balance Enquiry "));
		
		executor.shutdown();
	}

}
