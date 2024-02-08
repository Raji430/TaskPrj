package com.Task21;

import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2Task21 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver chrDriver = new ChromeDriver();
		
		String expectedPageText = "New Window";
		
		//Open the URL
		chrDriver.get("https://the-internet.herokuapp.com/windows");
		
		//Maximize the window
		chrDriver.manage().window().maximize();
		
		Thread.sleep(1000);
		//Click to open new tab
		chrDriver.findElement(By.partialLinkText("Click Here")).click();
		
		//Switching to new tab
		ArrayList<String> tab = new ArrayList<>(chrDriver.getWindowHandles());
		chrDriver.switchTo().window(tab.get(1));
		
		WebElement element = chrDriver.findElement(By.tagName("h3"));
		
		//Validating the newly opened tab content and closing the current tab
		String pageText = element.getText();
		if(expectedPageText.equals(pageText))
		{
			System.out.println("Page Text is: " + pageText);
			chrDriver.close();
		}
		Thread.sleep(1000); 
		
		//Switching the control to first opened window 
		
		chrDriver.switchTo().window(tab.get(0));
		
		//Validating the first opened tab is active
		String firstWindowTitle = chrDriver.getTitle();
		
		if(firstWindowTitle.equalsIgnoreCase("The Internet"))
		{
			System.out.println("First opened Tab is active");
		}
		
		chrDriver.close();
	}

}
