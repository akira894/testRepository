package com.labo.state.pattern;

public class Atm implements AtmState {

	/**************************************** FIELDS **************************************/
	
	private double cashInStock;
	private AtmState currentState;
	
	/************************************* CONSTRUCTORS ***********************************/
	
	public Atm() {
		currentState = new NoCashState(this);
	}
	
	public Atm(double defaultCash) {
		this.cashInStock = defaultCash;
		currentState = new WorkingState(this);
	}

	/************************************** PROPERTIES *************************************/
	
	public double getCashInStock() {
		return cashInStock;
	}

	public void setCashInStock(double newCashInStock) {
		this.cashInStock = newCashInStock;
	}
	
	/************************************* STATE METHODS ***********************************/
	
	@Override
	public void withDraw(double amount) {
		this.currentState.withDraw(amount);
	}

	@Override
	public void reFill(double amount) {
		this.currentState.reFill(amount);
	}

	public AtmState getState() {
		return this.currentState;
	}
	
	public void setState(AtmState state) {
		this.currentState = state;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Cash In Stock : %.2f\nCurrent ATM State : %s\n",this.cashInStock, this.currentState.getClass().getSimpleName());
	}

}
