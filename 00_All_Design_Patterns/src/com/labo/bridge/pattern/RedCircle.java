package com.labo.bridge.pattern;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int posX, int posY) {
		System.out.println(String.format("Drawing Circle "
				+ "[color: red, radius: %d, x: %d, y: %d]", 
				radius, posX, posY));
	}
	
}
