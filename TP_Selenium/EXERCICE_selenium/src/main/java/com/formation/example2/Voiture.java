package com.formation.example2;

public class Voiture {

	String color = "Red";
	int power = 12;
	public String marque = "BMW"; // ajout public = accessible par tout le monde
	private String carburant = "essence";

	// constructeurs qui portent le meme nom que la classe dont toujours un SANS ARGUMENT
	public Voiture() {
	}

	public Voiture(String color, int power, String marque) {
		// le this prend l'élément qui est pris dans Voiture/objet
		this.color = color;
		this.power = power;
		this.marque = marque;
	}

	// déclaration de méthode JAVA
	public void start() {
		System.out.println("Car starting...");
	}

	public void stop() {
		System.out.println("Car stopping...");
	}

	public int vitesse(int a) {
		if (a <= 0 || a > 4) {
			return 0;
		}
		if (a == 1)
			return a * power * 2;
		if (a == 2) {
			return a * power * 3;
		}
		if (a == 3) {
			return a * power * 4;
		} else {
			return a * power * 5;
		}
	}

}
