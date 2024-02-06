package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques1Task18 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver chromeDriver = new ChromeDriver();
		WebElement element;		
		
		//Expected Title of the page
		String expectedTitle = "Facebook – log in or sign up";
		
		//Open facebook URL
		chromeDriver.get("https://www.facebook.com");
		
		//Maximize the page
		chromeDriver.manage().window().maximize();
		
		//Get Page title
		String actualTitle = chromeDriver.getTitle();
		
		//Validate the page title	
		if(actualTitle.matches(expectedTitle))
		{
			System.out.println("Successfully navigated to facebook login page");
		}
		 
		//Create New Account Steps
		chromeDriver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(3000);				
		
		//Providing the inputs
		chromeDriver.findElement(By.name("firstname")).sendKeys("Rajyalakshmi");
		
		chromeDriver.findElement(By.name("lastname")).sendKeys("R");
		
		chromeDriver.findElement(By.name("reg_email__")).sendKeys("lakshmiece430@gmail.com");
		
		chromeDriver.findElement(By.name("reg_email_confirmation__")).sendKeys("lakshmiece430@gmail.com");
		
		chromeDriver.findElement(By.name("reg_passwd__")).sendKeys("Strongpass!321");
		
		Select day = new Select(chromeDriver.findElement(By.id("day")));
		day.selectByValue("11");
		
		Select month = new Select(chromeDriver.findElement(By.id("month")));
		month.selectByValue("5");
		
		Select year = new Select(chromeDriver.findElement(By.id("year")));
		year.selectByValue("1985");		
		
		chromeDriver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();		
		
		chromeDriver.findElement(By.name("websubmit"));		
		
	}

}
