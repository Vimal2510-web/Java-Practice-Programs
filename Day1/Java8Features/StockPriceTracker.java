package Java8Features;

import java.util.function.Supplier;

  // Real time stock price monitoring (Supplier interface)

public class StockPriceTracker {
	
	// Supplier is an interface represent function that supplies a result without requiring any input.
	
	public static void main(String[] args) {
		
		Supplier<Double> stockSupplier = () -> Math.random() * 100 + 200 ;
		
		System.out.println("Current Stock Price : $ " + stockSupplier.get());
	}

}
