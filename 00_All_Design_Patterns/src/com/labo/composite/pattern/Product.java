package com.labo.composite.pattern;

public class Product implements Item{
	
	/********************* FIELDS **********************/
	private int id;
	
	/****************** CONSTRUCTOR *******************/
	public Product(int id) {
		this.id = id;
	}

	/******************** METHODS *********************/	
	@Override
	public void print(int level) {
		System.out.println("\t".repeat(level) + "Product " + this.id);
	}
	
}
