package com.labo.adapter.pattern.ecom.TEST_OMS.v2;

public class OrderItem {
	
	/********************************* FIELDS ***********************************/
	
	private String name;
	private double price;
	
	/****************************** CONSTRUCTORS ********************************/
	
	public OrderItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/***************************** GETTERS/SETTERS ********************************/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	/********************************* METHODS ********************************/
	
	@Override
	public String toString() {
		return "OrderItem [name=" + name + ", price=" + price + "]";
	}
	
	
}
