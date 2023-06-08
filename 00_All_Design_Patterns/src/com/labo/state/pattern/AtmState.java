package com.labo.state.pattern;

// Automated teller machines (Guichet automatique bancaire)
public interface AtmState {
	public void withDraw(double amount);
	public void reFill(double amount);
}