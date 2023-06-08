package com.labo.proxy.pattern;

public class Launcher {
	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_10mb.webp");
		image.display();
	}
}
