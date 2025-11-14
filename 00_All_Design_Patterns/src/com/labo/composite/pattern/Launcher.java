package com.labo.composite.pattern;

public class Launcher {
	public static void main(String[] args) {
		
		// Initialize 4 products
		Product product1 = new Product(1);
		Product product2 = new Product(2);
		Product product3 = new Product(3);
		Product product4 = new Product(4);
		
		// Initialize 3 boxes
		Box box1 = new Box(1);
		Box box2 = new Box(2);
		Box box3 = new Box(3);
		
		// Put 3 items in box1
		box1.add(product1);
		box1.add(product2);
		box1.add(product3);
		
		// Put item 4 in box2
		box2.add(product4);
		
		// Put box1 and box2 in box3
		box3.add(box1);
		box3.add(box2);
		
		box3.print(0);
	}
}
