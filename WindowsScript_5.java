package com.formation;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsScript_5 {

    public static void main(String[] args) {
        checkWindows();
    }

    private static void checkWindows(){

        WebDriver driver = new ChromeDriver();

        try {
        	
            Path sampleFile = Paths.get("pages/window.html");
            
            driver.get(sampleFile.toUri().toString());
            
            System.out.println("Window title contents: " + driver.getTitle());
            
            String parentWindowHandle = driver.getWindowHandle();

            driver.switchTo().window("TwitterWindow");

            System.out.println("Window title contents: " + driver.getTitle());
            if (driver.getTitle().equalsIgnoreCase("Frame Twitter")) {
                System.out.println("Window title is Frame Twitter");
            } else {
                System.out.println("Window title is NOT Frame Twitter");
            }

            // Closing the "TwitterWindow"
            driver.close();

            driver.switchTo().window(parentWindowHandle);
            System.out.println("Parent window title contents: " + driver.getTitle());
            if (driver.getTitle().equalsIgnoreCase("Lesson 2")) {
                System.out.println("The script worked, the main window title is Lesson 2");
            } else {
                System.out.println("Something went wrong, the main window title is NOT Lesson 2");
            }
        } finally {
            driver.quit();
        }
    }
}