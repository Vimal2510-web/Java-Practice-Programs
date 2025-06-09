package OOPS;

import java.util.ArrayList;
import java.util.List;

// Online Shopping cart ( Encapsulation & polymorphism)

// Demonstrates product addition,removal and total calculation 

class Product {
	
	String name;
	double price;
	Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + " - ₹ " + price;
	}
	
}

class ShoppingCart{
	
	private final List<Product> cart = new ArrayList<>();
	
	public void addProduct(Product product) {
		
		cart.add(product);
		System.out.println(product + " added to the cart");
	}
	
	public void removeProduct(Product product) {
		
		cart.remove(product);
		System.out.println(product + " removed from the cart");
	}
	
	public void displayCart() {
		System.out.println("\n Shopping cart");
		
		cart.forEach(System.out::println);
	}
	
	public double getTotal() {
		
		return cart.stream().mapToDouble(p -> p.price).sum();
	}
	
	
}
public class OnlineShopping {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product laptop = new Product("Lenovo",36899.91);
		Product mobile = new Product("Samsung" , 17999.99);
		
		cart.addProduct(laptop);
		cart.addProduct(mobile);
		cart.displayCart();
		System.out.println("Total cost : " + cart.getTotal());
	}
	

	
	

}
