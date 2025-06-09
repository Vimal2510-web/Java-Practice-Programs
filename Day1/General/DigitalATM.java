package General;

import java.util.Scanner;

class ATM {
	
	public double balance;
	
	public ATM (double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit (double amount) {
		balance += amount;
		System.out.println("Deposited : " + amount);
		System.out.println("Balance : " + balance );
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			System.out.println(" Withdrrawn : " + amount);
			balance -=amount;
			System.out.println("Balance : " + balance);
			
		}else {
			System.out.println("Insufficient balance ");
		}
	}
	
	public void checkBalance() {
		System.out.println("Available balance : " + balance);
	}
	
}
public class DigitalATM {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ATM atm = new ATM(10000);
		
		while(true){
			System.out.println("\n Select option : 1. Deposit  2. Withdraw  3. CheckBalance  4.Exit");
			
			int option = scanner.nextInt();
			
			switch(option) {
			
			case 1 -> {
				System.out.println("Enter amount to deposit : ");
				atm.deposit(scanner.nextDouble());
			}
			
			case 2 -> {
				
				System.out.println("Enter amount to withdraw : ");
				atm.withdraw(scanner.nextDouble());
			}
			
			case 3 -> atm.checkBalance();
			
			case 4 -> {
				
				System.out.println("Exiting the account");
				scanner.close();
				System.exit(0);
			}
			default -> System.out.println("Invalid option choose the correct option");
		
	
			}
	}

}
}