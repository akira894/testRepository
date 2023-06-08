package com.iter_over_tree.test;

import java.util.List;

public class Launcher {
	
	public static void main(String[] args) {
		
		//---------------- TREE ----------------//
		 
		Node<String> n3 = new Node<>("N3");
		n3.addChildren(List.of(
			new Node<String>("N6"), 
			new Node<String>("N4"),
			new Node<String>("N7")
		));
		
		Node<String> n2 = new Node<>("N2");
		Node<String> n5 = new Node<String>("N5");
		n5.addChild(new Node<String>("N48"));
		
		n2.addChildren(List.of(
				n5,
				new Node<String>("N11"),
				new Node<String>("N28")
		));
		
		Node<String> rootNode = new Node<>("ROOT");
		rootNode.addChildren(List.of(n2, n3));
		
		//---------------------------------------//
		
		//-- TENTATIVE PARCOURS LARGEUR --//
		// TreeUtils.parcoursLargeur(rootNode);
		
		//-- TENTATIVE PARCOURS PROFONDEUR --//
		TreeUtils.parcoursProfondeur(rootNode);
	}
	

}
