package com.labo.state.pattern;

public class Launcher {

	public static void main(String[] args) {
		
		Atm atm = new Atm();
		System.out.println(atm);
		atm.reFill(1000);
		System.out.println(atm);
		atm.withDraw(200);
		System.out.println(atm);
		atm.withDraw(900);
		System.out.println(atm);
	}

}
