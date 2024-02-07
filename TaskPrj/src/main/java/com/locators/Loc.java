package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Loc {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.guvi.in/register");
		
		chromeDriver.manage().window().maximize();		
		Thread.sleep(1000);		
		
		// Below are Possible locators separated by locators
		
		//Locator by ID
		chromeDriver.findElement(By.id("name")).sendKeys("Raji");		
		chromeDriver.findElement(By.id("email")).sendKeys("rajiece430@gmail.com");		
		chromeDriver.findElement(By.id("password")).sendKeys("Strongpass@123");
		chromeDriver.findElement(By.id("mobileNumber")).sendKeys("9884308668");	
		chromeDriver.findElement(By.id("signup-btn")).click();	
			
		
		//Locator by ClassName
		//chromeDriver.findElement(By.className("form-control")).sendKeys("Raji");	
		
		//Below className won't work
		/*
	    chromeDriver.findElement(By.className("form-control")).sendKeys("rajiece430@gmail.com");		
		chromeDriver.findElement(By.className("form-control password-err")).sendKeys("Strongpass@123");
		chromeDriver.findElement(By.className("form-control countrycode-left")).sendKeys("9884308668");	
		chromeDriver.findElement(By.className("btn signup-btn")).click();	
		*/
		
		 //Locator by TagName
		 // chromeDriver.findElement(By.tagName("a")).click();		 
			
		/*
		//Locator by CSS Selector
		chromeDriver.findElement(By.cssSelector("#name")).sendKeys("Raji");
		chromeDriver.findElement(By.cssSelector("#email")).sendKeys("rajiece430@gmail.com");
		chromeDriver.findElement(By.cssSelector("#password")).sendKeys("Strongpass@123");
		chromeDriver.findElement(By.cssSelector("#mobileNumber")).sendKeys("9884308668");
		chromeDriver.findElement(By.cssSelector("#signup-btn")).click();
		*/
		
		/*
		//Locator by Xpath
		chromeDriver.findElement(By.xpath("//input[@id='name']")).sendKeys("Raji");
		chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajiece430@gmail.com");
		chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("Strongpass@123");
		chromeDriver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9884308668");
		chromeDriver.findElement(By.xpath("//a[@id='signup-btn']")).click();
		*/
	}

}
