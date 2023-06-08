package com.labo.proxy.pattern;

public class ConcreteImage implements Image {

	private String filename;
	
	public ConcreteImage(String filename) {
		this.filename = filename;
		loadFromDisk(filename);
	}
	
	@Override
	public void display() {
		System.out.println("Display " + filename);
	}
	
	private void loadFromDisk(String filename) {
		System.out.println("Loading " + filename + "...");
	}

}
