package com.labo.visitor.pattern.entity;

import com.labo.visitor.pattern.visitor.Visitor;

public interface Visitable {
	public void apply(Visitor visitor);
}
