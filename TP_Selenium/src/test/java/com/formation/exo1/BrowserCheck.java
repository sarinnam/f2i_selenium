package com.formation.exo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCheck {

	public static void main(String[] args) throws InterruptedException {
		String chromeDriverPath = "C:\\Users\\Formation\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		//ouvrir un navigateur chrome
		ChromeDriver webDriver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		webDriver.quit();
		
		
	}

}
