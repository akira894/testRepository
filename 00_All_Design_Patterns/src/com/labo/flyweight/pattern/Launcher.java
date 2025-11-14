package com.labo.flyweight.pattern;

import java.util.Random;

public class Launcher {
	
	static Random r = new Random();
	private static String[] types = {"Bus","Truck","Car"};
	private static String[] colors = {"red", "green", "blue"};
	private static int[] speeds = {50, 30, 80};
	
	public static void main(String[] args) throws InterruptedException {
		
		VehicleFactory factory = new VehicleFactory(5);
		
		// Create traffic vehicle 
		for (int i = 0; i < 20; i++) {
			Vehicle v = factory.getVehicle(
				getRandType(), 
				getRandColor(), 
				getRandSpeed(), 
				(r.nextInt(5) + 1)
			);
			
			if(v != null) {
				System.out.println("Vehicle " + (i+1));
				v.addToTraffic();
			}else {
				i--;
				
				Thread.sleep(1000);
			}
			
		}
		


	}
	
	private static String getRandType() {
		return types[r.nextInt(types.length)];
	}

	private static String getRandColor() {
		return colors[r.nextInt(types.length)];
	}
	
	private static int getRandSpeed() {
		return speeds[r.nextInt(speeds.length)];
	}
	
	
}
