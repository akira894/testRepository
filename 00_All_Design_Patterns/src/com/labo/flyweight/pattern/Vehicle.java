package com.labo.flyweight.pattern;

public class Vehicle {
	private String name;
	@SuppressWarnings("unused")
	private final String task;
	private String type;
	private String color;
	private int speed;
	private boolean active;
	private int duration;
	
	public Vehicle(String name) {
		/* Intrinsic state of the object */
		task ="Obstruct the racers";
		this.name = name;
	}
	
	public void setProperties(String type, String color, int speed, int duration) {
		this.type = type;
		this.color = color;
		this.speed = speed;
		this.duration = duration;
	}
	
	public boolean isActive() {
		return this.active;
	}
	
	public void addToTraffic( ) {
		/*add vehicle to the traffic*/
		
		System.out.println("=> " + name + "-" + type + "-" + color + "-" + speed + "km/h-" + duration + "seconds");
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				active = false;
				System.out.println(name + " => out");
			}
		}, duration * 1000);
		active = true;
	}
}
