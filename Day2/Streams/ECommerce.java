package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Dynamic filtering and sorting of e-commerce platforms

class Product{
	
	String name;
	double price;
	boolean isAvailable;
	Product(String name, double price, boolean isAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return name + " ₹ " + price;
	}
}
public class ECommerce {
	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(
				new Product("Laptop",39999.99,true),
				new Product("Mobile",17899,true),
				new Product("Bat",21489.24,false),
				new Product("Leather Ball",3400.19,true),
				new Product("Batting gloves", 8500,true));
	
	List<Product> availableProducts = products.stream()
			.filter(p -> p.isAvailable)
			.sorted((p1,p2) -> Double.compare(p1.price, p2.price))
					.collect(Collectors.toList());
	
	System.out.println("Available products : ");
	availableProducts.forEach(System.out::println);

}
}
