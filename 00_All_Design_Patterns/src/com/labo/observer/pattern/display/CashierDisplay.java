package com.labo.observer.pattern.display;

import com.labo.observer.pattern.observers.Observer;

// Affichage du caissier
public class CashierDisplay implements Observer {

	@Override
	public void update(String str) {
		System.out.println("[Cashier Display] " + str);
	}

}
