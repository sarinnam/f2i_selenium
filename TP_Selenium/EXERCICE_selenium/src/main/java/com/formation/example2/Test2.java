package com.formation.example2;

public class Test2 {

	public static void main(String[] args) {

		// instanciation de l'objet voiture v1
		// pas de pb comme Test3 car la classe Voiture estdans le meme projet
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();

		System.out.println("Puissance : " + v1.power);
		System.out.println("Marque : " + v1.marque);
		System.out.println("Couleur Avant : " + v1.color);

		v1.color = "Brown";
		System.out.println("Couleur Apres : " + v1.color);
		
		System.out.println("\nCouleur V2 : " + v2.color);
		
		
	}
}
