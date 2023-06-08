package com.labo.state.pattern;

public class WorkingState implements AtmState {

	Atm atm;
	
	public WorkingState(Atm atm) {
		this.atm = atm;
	}
	
	@Override
	public void withDraw(double amount) {
		double cashInStock = atm.getCashInStock();
		System.out.println("CASH IN STOCK : " + cashInStock);
		if (amount > cashInStock) {
			/*
			 * Insufficient fund.
			 * Dispense the available cash
			 * */
			amount = cashInStock;
		}
		
		System.out.println(amount + "€ is dispensed");
		double newCashInStock = cashInStock - amount;
		atm.setCashInStock(newCashInStock);
		
		if (newCashInStock == 0) {
			atm.setState(new NoCashState(atm));
		}
	}

	@Override
	public void reFill(double amount) {
		System.out.println(amount + " € is loaded");
		atm.setCashInStock(atm.getCashInStock() + amount);
	}

}
