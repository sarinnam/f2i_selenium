package com.formation.exo2;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeDriverPath = "C:\\Users\\Formation\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		//ouvrir un navigateur chrome
		ChromeDriver webDriver = new ChromeDriver();
		
		//chargement d'une page GOOLE
		webDriver.get("http://www.google.com");
		if (webDriver.getTitle().equalsIgnoreCase("google")) {
			System.out.println("OK, c'est GOOGLE !!!");
		} else {
			System.out.println("KO, ce n'est pas GOOGLE");
		}
		//Thread.sleep(2000);
		
		//chargement d'une page BING
		webDriver.navigate().to("http://www.bing.com");
		if (webDriver.getTitle().equalsIgnoreCase("bing")) {
			System.out.println("OK, c'est BING !!!");
		} else {
			System.out.println("KO, ce n'est pas BING");
		}
		//Thread.sleep(2000);
		
		//retour a la page GOOGLE puis BING
		webDriver.navigate().back();
		if (webDriver.getTitle().equalsIgnoreCase("google")) {
			System.out.println("OK, c'est GOOGLE !!!");
		} else {
			System.out.println("KO, ce n'est pas GOOGLE");
		}
		//Thread.sleep(2000);
				
		webDriver.navigate().forward();
		if (webDriver.getTitle().equalsIgnoreCase("bing")) {
			System.out.println("OK, c'est BING !!!");
		} else {
			System.out.println("KO, ce n'est pas BING");
		}
		//Thread.sleep(2000);
		
		webDriver.quit();
		
	}

}
