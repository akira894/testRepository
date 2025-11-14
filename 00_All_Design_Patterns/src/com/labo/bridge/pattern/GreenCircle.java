package com.labo.bridge.pattern;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int posX, int posY) {
		System.out.println(String.format("Drawing Circle "
				+ "[color: green, radius: %d, x: %d, y: %d]", 
				radius, posX, posY));
	}

}
