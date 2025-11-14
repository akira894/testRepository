package com.labo.observer.pattern.observers;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {

	List<Observer> addItemObservers = new ArrayList<>();
	
	@Override
	public void register(Observer obs) {
		addItemObservers.add(obs);
	}

	@Override
	public void notifyObservers(String itemLine) {
		for (Observer observer : addItemObservers) {
			observer.update(itemLine);
		}
	}

}
