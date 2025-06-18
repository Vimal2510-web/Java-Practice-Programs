package Week2Day2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Transaction{
	
	String cardNumber;
	double amount;
	LocalDateTime timeStamp;
	String location;
	public Transaction(String cardNumber, double amount, LocalDateTime timeStamp, String location) {
		super();
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Transaction [cardNumber=" + cardNumber + ", $ " + amount + "," + timeStamp
				+ "," + location + "]";
	}
	
}

class FraudDetector{
	
	// Stores running list of all transaction have been scanned
	
	List<Transaction> history = new ArrayList<>();
	
	// Stored detect method that accepts new transaction and prepares flagged list to store suspicious transactions
	
	List<Transaction> detect(List<Transaction> newTxns){
		List<Transaction> flagged = new ArrayList<>();
		
			
		// iterates into new transactions and add it to history 
		for(Transaction txn : newTxns) {
			history.add(txn);
		
		// Rule 1:
		boolean highAmount = txn.amount >= 5000;
		
		// Rule 2 :
		boolean differentLocations = history.stream()
				.filter (t->t.cardNumber.equals(txn.cardNumber) &&
						!t.location.equals(txn.location) &&
						Math.abs(t.timeStamp.getMinute()- txn.timeStamp.getMinute()) <= 5 &&
						Math.abs(t.timeStamp.getHour()- txn.timeStamp.getHour()) == 0)
				.count() >=1;
				
				if(highAmount || differentLocations) {
					flagged.add(txn);
				}
	}
	
	return flagged;     // returns all flagged transactions
	
		
	}
}
public class CreditCardFraudDetector {
	
	public static void main(String[] args) {
		
		List<Transaction> incoming = Arrays.asList(
				new Transaction("1234", 3000.0,LocalDateTime.now().minusMinutes(10),"Chennai"),
				new Transaction("4567",4000.23,LocalDateTime.now(),"Mumbai"),
				new Transaction ("3456",5000.34,LocalDateTime.now().minusMinutes(3),"Delhi"),
				new Transaction ("3456",6035.43,LocalDateTime.now(),"New York"));
		
		FraudDetector detector = new FraudDetector();    // create instance for fraud detection
		
		try {
		List<Transaction> flagged = detector.detect(incoming);  // collects suspicious ones into flagged list
		
		if(flagged.isEmpty()) {
			System.out.println("No suspicious transactions");
		}
		else {
			System.out.println("Flagged Suspicious Transactions...");
			for(Transaction txn : flagged) {  // iterates into flagged list
				System.out.println(txn);
			}
		}
		} catch(Exception e) {
			System.out.println("Error occured while processing transactions : " + e.getMessage());
			e.printStackTrace();  // optional for debugging
		}
		
	}

}
