package com.labo.state.pattern;

public class NoCashState implements AtmState {

	private Atm atm;
	
	public NoCashState(Atm atm) {
		this.atm = atm;
	}
	
	@Override
	public void withDraw(double amount) {
		System.out.println("Out of cash"/* plus d'espèce */);
	}

	@Override
	public void reFill(double amount) {
		System.out.println(amount + " € is loaded");
		atm.setState(new WorkingState(atm));
		atm.setCashInStock(amount);
	}

}
