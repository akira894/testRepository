package com.labo.visitor.pattern.visitor;

import com.labo.visitor.pattern.entity.FoodItem;
import com.labo.visitor.pattern.entity.LiquorItem;

public class TaxVisitor implements Visitor {

	private double totalTax = 0.0;
	
	@Override
	public void visit(FoodItem item) {
		/* apply 2% tax on food items */
		double tax = item.getPrice() * 0.021;
		totalTax += tax;
		item.setPrice(item.getPrice() + tax);
	}

	@Override
	public void visit(LiquorItem item) {
		/* apply 20% tax on liquors items */
		double tax = item.getPrice() * 0.20;
		totalTax += tax;
		item.setPrice(item.getPrice() + tax);
	}
	
	public double getTotalTax() {
		return totalTax;
	}

}
