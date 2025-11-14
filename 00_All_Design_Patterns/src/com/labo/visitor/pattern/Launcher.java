package com.labo.visitor.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.labo.visitor.pattern.entity.FoodItem;
import com.labo.visitor.pattern.entity.LiquorItem;
import com.labo.visitor.pattern.entity.Visitable;
import com.labo.visitor.pattern.visitor.DiscountVisitor;
import com.labo.visitor.pattern.visitor.TaxVisitor;

public class Launcher {

	public static void main(String[] args) {
		
		// Create an order and add items
		List<Visitable> order = new ArrayList<Visitable>();
		order.add(new FoodItem(1, "Italian Pizza", 6.99, 2));
		order.add(new LiquorItem(45, "Wine", 9.99, 1));
		order.add(new LiquorItem(42, "Beer", 5.99, 2));
		order.add(new FoodItem(6, "Red Apple", 1.49, 1));
		order.add(new FoodItem(22, "Almonds", 11.99, 1));
		
		// Create visitors to be applied
		@SuppressWarnings("unused")
		DiscountVisitor discountVisitor = new DiscountVisitor();
		TaxVisitor taxVisitor = new TaxVisitor();
		
		/*******************************************************/
		/**@Test**/
		
		double subTotal = buildStoreTicket(order);
		
		for(Visitable item : order) {
			item.apply(taxVisitor);
		}
		
		System.out.println(String.format("%-32s %10.2f €" , "Total Tax:", taxVisitor.getTotalTax()));
		System.out.println(String.format("%-32s %10.2f €", "Total:", subTotal + taxVisitor.getTotalTax()));
		
		
		/*******************************************************/
		
		// Apply visitors on items
		
		// for(Visitable item : order) {
		//	 item.apply(discountVisitor);
		//	 item.apply(taxVisitor);
		// }


		// RESULTS
		// System.out.println(String.format("Total Discount = %.2f", discountVisitor.getTotalDiscount()));
		// System.out.println(String.format("Total Tax = %.2f" , taxVisitor.getTotalTax()));
	}
	
	
	public static void showFoodItemsDetails(List<Visitable> order) {
		// All FoodItems
		List<Visitable> FoodItems = order.stream()
				   .filter(item -> item instanceof FoodItem)
				   .collect(Collectors.toList());
		
		
		double foodTotalPrice = FoodItems.stream()
				.map(i -> ((FoodItem)i).getPrice())
				.reduce(0.0, (acc, current) -> acc + current);

		System.out.println(String.format("Food Total Price : %.2f", foodTotalPrice));
	}
	
	public static double buildStoreTicket(List<Visitable> order) {
		double subTotal = 0;
		for(Visitable orderItem : order) {
			if(orderItem instanceof FoodItem) {
				FoodItem item = (FoodItem)orderItem;
				System.out.println(String.format("%-2d %-30s %10.2f €",
						item.getQuantity(), item.getName(), item.getPrice()
				));
				subTotal += item.getPrice();
			}else if (orderItem instanceof LiquorItem) {
				LiquorItem item = (LiquorItem)orderItem;
				System.out.println(String.format("%-2d %-30s %10.2f €",
						item.getQuantity(), item.getName(), item.getPrice()
					));
				subTotal += item.getPrice();
			}
		}
		
		System.out.println("\n");
		System.out.println("-".repeat(46));
		System.out.println(String.format("%-32s %10.2f €", "Sub-total:", subTotal));
		return subTotal;
	}
}
