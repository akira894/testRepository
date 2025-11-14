package com.labo.adapter.pattern.ecom.TEST_OMS.v2.oms;

import java.util.ArrayList;
import java.util.List;

import com.labo.adapter.pattern.ecom.TEST_OMS.v2.OrderItem;
import com.labo.adapter.pattern.ecom.TEST_OMS.v2.payment.Payment;

public class Old_OMS {
	
	List<OrderItem> cart = new ArrayList<OrderItem>();
	List<Payment> payments = new ArrayList<Payment>();
	
	public void addItem(OrderItem XMLitem) {
		cart.add(XMLitem);
		System.out.println(XMLitem);
	}
	
	public void MakePayment(Payment paymentXML) {
		payments.add(paymentXML);
		paymentXML.pay();
	}
}
