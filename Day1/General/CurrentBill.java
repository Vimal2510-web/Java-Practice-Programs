package General;

public class CurrentBill {
	
	double billAmount(int units, int cost) {
		double billAmount = units * cost;
		
		if(units<200) {
			return 0;
		}
		
		else {
			
			return billAmount;
		}
	}
	
	public static void main(String[] args) {
		
		CurrentBill bill = new CurrentBill();
		System.out.println("The total bill amount : " + bill.billAmount(232,7));
		
	}

}
