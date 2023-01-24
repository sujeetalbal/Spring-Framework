package aopdemo;

import org.springframework.stereotype.Component;

@Component //creating bean for ShoppingCart component
public class ShoppingCart {

//	public void checkout(String status) {
	public void checkout() {
		
		// Logging -----------------------------> Cross cutting concerns -> this is an Aspect
		// Authentication and Authorization  ---> Cross cutting concerns -> this is an Aspect
		// Security  ---------------------------> Cross cutting concerns -> this is an Aspect
		System.out.println("Checkoout method from ShoppingCart called"); // business logic
		
	}
	
	public int quantity() {
		return 10;
	}
}
