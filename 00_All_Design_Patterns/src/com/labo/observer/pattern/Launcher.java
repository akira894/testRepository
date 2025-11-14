package com.labo.observer.pattern;

import com.labo.observer.pattern.entity.Item;
import com.labo.observer.pattern.entity.Payment;
import com.labo.observer.pattern.observable.Order;

public class Launcher {
	
	public static void main(String[] args) {
		
		
		/* Create an order and add items */
		Order order = new Order();
		order.addItemToCart(new Item("Pizza", 6.99));
		order.addItemToCart(new Item("Wine", 9.99));
		order.addItemToCart(new Item("Beer", 4.99));
		order.addItemToCart(new Item("Apple", 0.99));
		
		System.out.println("\n" + "-".repeat(50));
		
		/* Create payments and make payments */
		order.makePayment(new Payment("CASH", 20.00));
		order.makePayment(new Payment("CREDIT", 10.00));
		order.makePayment(new Payment("DEBIT", 10.00));
		
		System.out.println("\n" + "-".repeat(50));
		
		/* Complete order. */
		order.completeOrder();
	}
	
}
