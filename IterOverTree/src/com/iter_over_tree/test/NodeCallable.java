package com.iter_over_tree.test;

public interface NodeCallable<T> {
	void process(Node<T> value, int level);
}