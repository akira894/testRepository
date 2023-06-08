package com.labo.proxy.pattern;

public class ProxyImage implements Image {

	private ConcreteImage concreteImage;
	private String filename;
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void display() {
		if(concreteImage == null)
			concreteImage = new ConcreteImage(filename);
		concreteImage.display();
	}

}
