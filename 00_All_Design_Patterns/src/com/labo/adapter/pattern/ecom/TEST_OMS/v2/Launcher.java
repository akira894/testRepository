package com.labo.adapter.pattern.ecom.TEST_OMS.v2;

import com.labo.adapter.pattern.ecom.TEST_OMS.v2.payment.Payment;
import com.labo.adapter.pattern.ecom.TEST_OMS.v2.payment.PaymentType;

/*
 * TEST OMS => ORDER MANAGEMENT SYSTEM
 * 
 * Main idea : 
 * 
 * Assumons le fait d'avoir un e-commerce en prod depuis longtemps et que beaucoup d'utilisateurs ont déjà utilisés.
 * Le systéme de management des commandes (OMS) utilisé par l'application devient couteux sur les performances.
 * Il faut donc choisir un autre OMS et en regardant ceux disponibles sur le marché, il y en a un plus léger disponible
 * et dont les performances ne sont plus à démontrer. Toutefois, je réalise en l'implémentant que les interfaces sont
 * différentes dans le nouvel OMS et que cela va me couter un gros temps de migration puisqu'il y a un grand nombre de 
 * lignes de code à changer.
 * 
 * Le patron Adapter peut être très utile pour ce genre de situation. En lieu et place de modifier l'e-commerce app pour
 * utiliser les nouvelles interfaces, je peux écrire une classe 'wrapper' qui acte comme un pont entre mon e-commerce app et
 * le nouveau logiciel OMS. Avec cette approche, l'e-commerce app peut continuer à utiliser l'ancienne interface si 
 * nécessaire.
 * 
 * Le patron adapter peut être implémenté de deux façons : 
 * 
 * - La première en utilisant la méthode d'héritage ('classAdapter' -> Pas celle recommandée dans mon cas (limitation des inter-dépendances) )
 * - Enfin, La seconde utilisant la composition (Plus facile à maintenir et limite les inter-dépendances entre objets => parfait)
 * 
 * 
 * */

public class Launcher {

	public static void main(String[] args) {
		
		// Old_OMS oms = new Old_OMS();
		OMSAdapter oms = new OMSAdapter();
		
		
		// ORDER CART => ADD ITEMS
		System.out.println("-".repeat(39));
		System.out.println("PROCESS STEP :: ADD ITEMS TO ORDER CART");
		System.out.println("-".repeat(39) + "\n");
		
		oms.addItem(new OrderItem("Italian Pizza", 8.99));
		oms.addItem(new OrderItem("Wine", 12.99));
		oms.addItem(new OrderItem("Beer", 7.00));
		oms.addItem(new OrderItem("red apple", 0.99));
		oms.addItem(new OrderItem("Grape", 3.49));
		oms.addItem(new OrderItem("Almonds", 4.99));
		
		
		System.out.println("\n" + "-".repeat(39));
		System.out.println("PROCESS STEP :: MAKE PAYMENT");
		System.out.println("-".repeat(39));
		
		oms.MakePayment(new Payment(PaymentType.CASH, 20.00));
		oms.MakePayment(new Payment(PaymentType.CREDIT, 15.00));
		oms.MakePayment(new Payment(PaymentType.DEBIT, 10.00));
		
	}

}
