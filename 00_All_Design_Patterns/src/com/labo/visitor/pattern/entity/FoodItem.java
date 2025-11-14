package com.labo.visitor.pattern.entity;

import com.labo.visitor.pattern.visitor.Visitor;

public class FoodItem implements Visitable {

	/********************************** FIELDS **********************************/
	
	private int id;
	private String name;
	private double price;
	private int quantity;
		
	/******************************* CONSTRUCTOR **********************************/
	
	public FoodItem(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/******************************* PROPERTIES **********************************/

	public double getPrice() {
		return price * quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/********************************** METHODS **********************************/
	
	@Override
	public void apply(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
