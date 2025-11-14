package com.labo.visitor.pattern.visitor;

import com.labo.visitor.pattern.entity.FoodItem;
import com.labo.visitor.pattern.entity.LiquorItem;

public class DiscountVisitor implements Visitor {

	
	private double max_cumul_discount  = 0.375;
	private double totalDiscount = 0.0;

	
	
	@Override
	public void visit(FoodItem item) {
		/* apply 30% off food discount */
		double discount = item.getPrice() * Math.min(0.3, max_cumul_discount);
		totalDiscount += discount;
		item.setPrice(item.getPrice() - discount);
	}

	@Override
	public void visit(LiquorItem item) {
		/* apply 10% off food discount */
		double discount = item.getPrice() * Math.min(0.1, max_cumul_discount);
		totalDiscount += discount;
		item.setPrice(item.getPrice() - discount);
	}
	
	
	public double getTotalDiscount() {
		return totalDiscount;
	}

}
