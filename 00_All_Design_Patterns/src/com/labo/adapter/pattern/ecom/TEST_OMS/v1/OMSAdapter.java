package com.labo.adapter.pattern.ecom.TEST_OMS.v1;

import com.labo.adapter.pattern.ecom.TEST_OMS.v1.oms.NewOms;
import com.labo.adapter.pattern.ecom.TEST_OMS.v1.payment.Payment;

// WRAPPER COMPONENT
public class OMSAdapter {
	
	private NewOms newOMS;
	
	public OMSAdapter() {
		this.newOMS = new NewOms();
	}
	
	public void addItem(OrderItem item) {
		convertXmlToJson(item);
		newOMS.addToBasket(item);
	}
	
	public void MakePayment(Payment p) {
		convertXmlToJson(p);
		newOMS.pay(p);
	}
	
	public void convertXmlToJson(Object o) {
		System.out.println("Converted From XML to JSON");
	}
	
}
