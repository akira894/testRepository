package com.labo.adapter.pattern.ecom.TEST_OMS.v2.payment;

public class Payment {

	/********************************** FIELDS **********************************/
	
	private PaymentType paymentType;
	private double amount;
	
	
	/****************************** CONSTRUCTORS ********************************/

	
	public Payment(PaymentType paymentType, double amount) {
		this.paymentType = paymentType;
		this.amount = amount;
	}


	/******************************* PROPERTIES ********************************/
	
	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	/******************************** METHODS ***********************************/

	public void pay() {
		System.out.println(String.format("Payment Type : %s\nAmount : %.2f €\n", paymentType.name(), amount));
	}
	
}
