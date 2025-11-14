package com.labo.flyweight.pattern;

import java.util.Vector;

public class VehicleFactory {

	private Vector<Vehicle> pool = new Vector<Vehicle>();
	private int minPoolSize = 1;
	private int maxPoolSize = 25;
	
	
	public VehicleFactory(int poolSize) {
		int pSize = Utils.clamp(poolSize, minPoolSize, maxPoolSize);
		for (int i = 0; i < pSize; i++) {
			// Create traffic vehicles and add it to the vehicle pool
			pool.add(new Vehicle("vehicle " + (i+1)));
		}
	}
	
	/*Retrieve the vehicle from the pool and set the properties*/
	public Vehicle getVehicle(String type, String color, int speed, int duration) {
		for (Vehicle vehicle : pool) {
			if(!vehicle.isActive()) {
				vehicle.setProperties(type, color, speed, duration);
				return vehicle;
			}
		}
		return null;
	}
	
	
}
