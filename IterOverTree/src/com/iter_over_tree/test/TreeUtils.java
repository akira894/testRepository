package com.iter_over_tree.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeUtils {
	
	public static void parcoursLargeur(Node<String> rootNode) {
		
		Queue<Node<String>> queue = new LinkedList<>();
		queue.add(rootNode);
		
		Node<String> levelNode = null;
		while(!queue.isEmpty()) {
			int currentLevel = 0;
			Node<String> currentNode = queue.poll();
			levelNode = currentNode.parent;
			while(levelNode != null) {
				currentLevel++;
				levelNode = levelNode.parent;
			}
			if(currentNode.children != null && currentNode.children.size() > 0) {
				queue.addAll(currentNode.children);
			}
			
			System.out.println("\t".repeat(currentLevel) + currentNode);
		}
	}
	
	public static void parcoursProfondeur(Node<String> rootNode) {
		long startTime = System.currentTimeMillis();
		
		Stack<Integer> indexStack = new Stack<Integer>();
		Node<String> currentNode = rootNode;
		System.out.println(rootNode.toString());
		indexStack.push(0);
		
		while(true) {
			int collsize = currentNode.children.size();
			int i = indexStack.pop();
			for (; i < collsize; i++) {
				
				System.out.println("\t".repeat(indexStack.size() + 1) + currentNode.children.get(i));
				
				if(currentNode.children.get(i).children.size() > 0) {
					indexStack.push(i+1);
					indexStack.push(0);
					currentNode = currentNode.children.get(i);
					break;
				}
				
				if (i + 1 == collsize) 
					currentNode = currentNode.parent;
			}
			
			if(indexStack.empty()) {
				System.out.println("FINISH");
				break;
			}
		}
		
		System.out.println("Total Time : " + (System.currentTimeMillis() - startTime) + " millis");
	}

}
