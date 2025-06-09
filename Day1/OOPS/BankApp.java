package OOPS;

// Encapsulation --> hiding the bank balance details


class BankAccount{
	
	public double balance;
	
	public BankAccount(double initialBalance) {
		this.balance= initialBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited amount : " + amount);
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
		balance -= amount;	
	System.out.println("Withdrawl amount : " + amount);
	
	}else {
		System.out.println("Insufficient Balance");
		
	}
	
}
	public double getBalance() {
		return balance;
	}
}
public class BankApp {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		
		account.deposit(700);
		account.withdraw(800);
		System.out.println("Final balance : " + account.getBalance());
		
	}
}
