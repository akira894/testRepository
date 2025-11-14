package com.labo.observer.pattern.entity;

public class Payment {

	public final String type;
	public final double amount;
	
	public Payment(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	
}
