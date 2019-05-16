package com.formation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        try {
        	
        	// charger le page
            driver.get("https://www.google.com");

            // Attendre 5 minutes si pas de reponse => Exeption
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

            // Si vérifier le titre
            if (driver.getTitle().equalsIgnoreCase("Google")) {
                System.out.println("Script worked, le titre contient 'Google'");
            } else {
                System.out.println("Désolé, la page 'Google' que vous demandez est introuvable");
            }

            // Naviguer vers Bing
            driver.navigate().to("https://www.bing.com");
            if (driver.getTitle().equalsIgnoreCase("Bing")) {
                System.out.println("Script worked, le titre contient 'Bing'");
            } else {
                System.out.println("Désolé, la page 'Bing' que vous demandez est introuvable");
            }

            // revenir dans l'historique (Google)
            driver.navigate().back();

            if (driver.getTitle().equalsIgnoreCase("Google")) {
                System.out.println("Script worked, le titre contient 'Google'");
            } else {
            	System.out.println("Désolé, la page 'Google' que vous demandez est introuvable");
            }
        } finally {
            driver.quit();
        }
	}
}
