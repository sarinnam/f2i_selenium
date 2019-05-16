package com.formation;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndIFrame_4  {

    public static void main(String[] args) {
        checkFrames();
        checkIFrames();
    }

    private static void checkFrames(){

        WebDriver driver = new ChromeDriver();

        try {
        	
            Path sampleFile = Paths.get("pages/my_frame.html");
            driver.get(sampleFile.toUri().toString());

            driver.switchTo().frame("info");
            if (driver.getPageSource().contains("Frame Info")) {
                System.out.println("Focus was changed to Frame Info");
            } else {
                System.out.println("Focus was not changed to Frame Info");
            }

            // sortir du frame
            driver.switchTo().defaultContent();

            driver.switchTo().frame("title");
            
            if (driver.getPageSource().contains("Frame Title")) {
                System.out.println("Focus was changed to Frame Title");
            }
            else {
                System.out.println("Focus was not changed to Frame Title");
            }

        } finally {
            driver.quit();
        }
    }

    private static void checkIFrames(){

        WebDriver driver = new ChromeDriver();

        try {
            Path sampleFile = Paths.get("pages/my_frame.html");
            driver.get(sampleFile.toUri().toString());
            
            driver.switchTo().frame("twitter");
            
            if (driver.getPageSource().contains("Frame Twitter")) {
                System.out.println("Focus was changed to iFrame Twitter");
            } else {
                System.out.println("Something went wrong with the script");
            }

            WebElement twitterFrame = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(twitterFrame);
            
            WebElement followButton = driver.findElement(By.id("follow-button"));
            followButton.click();

            driver.switchTo().defaultContent();

        } finally {
            driver.quit();
        }
    }
}