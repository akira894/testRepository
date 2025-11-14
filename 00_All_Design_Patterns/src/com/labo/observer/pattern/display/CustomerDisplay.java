package com.labo.observer.pattern.display;

import com.labo.observer.pattern.observers.Observer;

// Affichage du client
public class CustomerDisplay implements Observer{

	@Override
	public void update(String str) {
		System.out.println("[Customer Display] " + str);
	}

}
