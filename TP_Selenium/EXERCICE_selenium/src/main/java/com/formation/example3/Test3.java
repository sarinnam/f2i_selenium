package com.formation.example3;

import com.formation.example2.Voiture;

public class Test3 {

	public static void main(String[] args) {
		
		Voiture v1 = new Voiture(); // prend les infos par defaut
		Voiture v2 = new Voiture("Yellow", 15, "Renault"); //
		System.out.println("La marque de v2 est " +v2.marque);
		System.out.println("La marque de v1 est " +v1.marque);
		
		v1.start();
		v1.stop();
		
		//System.out.println(v1.vitesse(4));
		int v = v1.vitesse(2);
		System.out.println(v);
	}
	
}
