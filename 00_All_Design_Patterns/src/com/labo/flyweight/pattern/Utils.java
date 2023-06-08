package com.labo.flyweight.pattern;

public class Utils {

	public static int clamp(int value, int min, int max) {
		return Math.min(Math.max(value, min), max);
	}
	
}
