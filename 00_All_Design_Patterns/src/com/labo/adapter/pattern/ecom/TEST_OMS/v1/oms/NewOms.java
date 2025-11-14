package com.labo.adapter.pattern.ecom.TEST_OMS.v1.oms;

import java.util.ArrayList;
import java.util.List;

import com.labo.adapter.pattern.ecom.TEST_OMS.v1.OrderItem;
import com.labo.adapter.pattern.ecom.TEST_OMS.v1.payment.Payment;

public class NewOms {
	
	List<OrderItem> cart = new ArrayList<OrderItem>();
	List<Payment> payments = new ArrayList<Payment>();
	
	public void addToBasket(OrderItem JSONItem) {
		cart.add(JSONItem);
		System.out.println(JSONItem);
	}
	
	public void pay(Payment JSONPayment) {
		payments.add(JSONPayment);
		JSONPayment.pay();
	}
}
