package com.labo.observer.pattern.observers;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {

	List<Observer> addPaymentObservers = new ArrayList<>();
	
	@Override
	public void register(Observer obs) {
		addPaymentObservers.add(obs);
	}

	@Override
	public void notifyObservers(String itemLine) {
		for (Observer observer : addPaymentObservers) {
			observer.update(itemLine);
		}
	}

}
