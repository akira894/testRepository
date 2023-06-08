package com.labo.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item{

	/********************* FIELDS **********************/
	private int id;
	private List<Item> items = new ArrayList<>();
	
	/****************** CONSTRUCTOR *******************/
	public Box(int id) {
		this.id = id;
	}

	/******************** METHODS *********************/
	@Override
	public void print(int level) {
		System.out.println("\t".repeat(level) + "Box " + this.id);
		for (Item item : items) {
			item.print(level + 1);
		}
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void remove(Item item) {
		items.remove(item);
	}
}
