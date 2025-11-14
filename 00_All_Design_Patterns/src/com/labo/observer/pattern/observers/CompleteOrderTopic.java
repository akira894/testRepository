package com.labo.observer.pattern.observers;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

	List<Observer> orderCompletedObservers = new ArrayList<>();
	
	@Override
	public void register(Observer obs) {
		orderCompletedObservers.add(obs);
	}

	@Override
	public void notifyObservers(String itemLine) {
		for (Observer observer : orderCompletedObservers) {
			observer.update(itemLine);
		}

	}

}
