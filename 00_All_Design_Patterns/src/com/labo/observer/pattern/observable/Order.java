package com.labo.observer.pattern.observable;

import java.util.ArrayList;
import java.util.List;

import com.labo.observer.pattern.display.CashierDisplay;
import com.labo.observer.pattern.display.CustomerDisplay;
import com.labo.observer.pattern.entity.Item;
import com.labo.observer.pattern.entity.Payment;
import com.labo.observer.pattern.observers.AddItemTopic;
import com.labo.observer.pattern.observers.CompleteOrderTopic;
import com.labo.observer.pattern.observers.Observer;
import com.labo.observer.pattern.observers.Topic;

public class Order {
	
	List<Item> cart = new ArrayList<>();
	List<Payment> payments = new ArrayList<>();
	
	private Topic addItemTopic;
	private Topic addPaymentTopic;
	private Topic completeOderTopic;
	
	public Order() {
		
		// Create Observers (devices)
		Observer cashierDisplay = new CashierDisplay();
		Observer customerDisplay = new CustomerDisplay();
		
		// Create subject (events)
		addItemTopic = new AddItemTopic();
		addPaymentTopic = new AddItemTopic();
		completeOderTopic = new CompleteOrderTopic();
		
		// Cashier display subscribes to all topics
		addItemTopic.register(cashierDisplay);
		addPaymentTopic.register(cashierDisplay);
		completeOderTopic.register(cashierDisplay);
		
		// Customer display subscribes to all topics
		addItemTopic.register(customerDisplay);
		addPaymentTopic.register(customerDisplay);
		completeOderTopic.register(customerDisplay);
	}
	
	
	public void addItemToCart(Item item) {
		cart.add(item);
		String line = String.format("%s %f €", item.name, item.price);
		addItemTopic.notifyObservers(line);
	}
	
	public void makePayment(Payment payment) {
		payments.add(payment);
		String line = String.format("Payment Type : %s", payment.type, payment.amount);
		addPaymentTopic.notifyObservers(line);
	}
	
	public void completeOrder() {
		// State à passer dans ce cas
		String line = "Order Complete";
		completeOderTopic.notifyObservers(line);
	}
}
