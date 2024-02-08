package com.Task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2Task20 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver chromeDriver = new ChromeDriver();
		
		//Open Guvi URL
		chromeDriver.get("https://www.guvi.in");		
			
		//Maximize the window
		chromeDriver.manage().window().maximize();		
		Thread.sleep(1000);		
		
		//Click on Sign up
		chromeDriver.findElement(By.partialLinkText("Sign up")).click();		
		
		//Sign up form details
		chromeDriver.findElement(By.id("name")).sendKeys("Raji");		
		chromeDriver.findElement(By.id("email")).sendKeys("rajiece430@gmail.com");		
		chromeDriver.findElement(By.id("password")).sendKeys("Strongpass@123");
		chromeDriver.findElement(By.id("mobileNumber")).sendKeys("9884308668");	
		chromeDriver.findElement(By.id("signup-btn")).click();	
		
		//Navigating to home page to click on login	
		chromeDriver.get("https://www.guvi.in");		
		
		//Maximize the window
		chromeDriver.manage().window().maximize();		
		Thread.sleep(1000);		
		
		//Clicking on Login button
		chromeDriver.findElement(By.partialLinkText("Login")).click();	
		
		//Login Details
		chromeDriver.findElement(By.id("email")).sendKeys("rajiece430@gmail.com");	
		chromeDriver.findElement(By.id("password")).sendKeys("Strongpass@123");
		chromeDriver.findElement(By.id("login-btn")).click();	
		
		//Get title to validate
		String title = chromeDriver.getTitle();
		
		System.out.println("Successfully logged in. Browser title is: " + title);
		
		chromeDriver.close();

	}

}
