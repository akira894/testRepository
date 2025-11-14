package com.labo.visitor.pattern.visitor;

import com.labo.visitor.pattern.entity.FoodItem;
import com.labo.visitor.pattern.entity.LiquorItem;

public interface Visitor {
	void visit(FoodItem item);
	void visit(LiquorItem item);
}
