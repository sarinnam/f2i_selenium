package com.formation.exo2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FenetreScript_2 {
	public static void main(String[] args) {
		activityLesson02AutomationScript();
	}

	//attendre 5 min pour voir s'il n'y a pas de probleme reseau
	private static void activityLesson02AutomationScript() {
		WebDriver driver = new ChromeDriver();
		try {

			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
			//si navigateur est en taille 500*300
			driver.manage().window().setSize(new Dimension(300, 500));
			if (driver.manage().window().getSize().getHeight() >= 500
					&& driver.manage().window().getSize().getWidth() >= 300) {
				System.out.println("Load script worked, the window was resized");
			} else {
				System.out.println(
						"Something went wrong with the script, the window was not resized to the desired size");
			}
			driver.manage().window().maximize();
			if (driver.manage().window().getSize().getHeight() >= 500
					&& driver.manage().window().getSize().getWidth() >= 300) {
				System.out.println("Load script worked, the window was resized");
			} else {
				System.out.println("Something went wrong with the script, the window was not resized");
			}
			driver.manage().window().setSize(new Dimension(300, 500));
			Thread.sleep(5000);
			System.out.println(String.format("Current window size is %s height x %s width",
					driver.manage().window().getSize().getHeight(), driver.manage().window().getSize().getWidth()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}