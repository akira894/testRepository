package com.labo.observer.pattern.observers;

public interface Topic {
	public void register(Observer obs);
	public void notifyObservers(String itemLine);
}
