package com.labo.adapter.pattern.ecom.TEST_OMS.v2;

import com.labo.adapter.pattern.ecom.TEST_OMS.v2.oms.NewOms;
import com.labo.adapter.pattern.ecom.TEST_OMS.v2.payment.Payment;

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
