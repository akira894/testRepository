package com.iter_over_tree.test;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	
	// --------- FIELDS --------- //
	public T tagObject;
	public Node<T> parent;
	public List<Node<T>> children = new ArrayList<>();
	
	// ------ CONSTRUCTORS ------ //
	public Node() {}
	public Node(T tagObject) {
		this.tagObject = tagObject;
	}
	
	// --------- METHODS -------- //
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	
	public void addChild(Node<T> Child) {
		Child.setParent(this);
		children.add(Child);
	}
	
	public void addChildren(List<Node<T>> Children) {
		for(Node<T> node : Children) {
			node.setParent(this);
			children.add(node);
		}
	}
	
	@Override
	public String toString() {
		return tagObject.toString();
	}
}
