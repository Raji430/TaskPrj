package com.task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Ques2Task18 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver chromeDriver = new ChromeDriver();
		
		String targetColor = "#777620", targetText = "Dropped!" ;
		
		//Open jqueryui URL
		chromeDriver.get("https://jqueryui.com/droppable");
		
		//Maximize the window
		chromeDriver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Switch to Frame
		chromeDriver.switchTo().frame(0);
		
		//Drag from
		WebElement dragFrom = chromeDriver.findElement(By.id("draggable"));
		
		//Drag To
		WebElement dropTo = chromeDriver.findElement(By.id("droppable"));
		
		Actions act = new Actions(chromeDriver);
		
		act.dragAndDrop(dragFrom, dropTo).perform();
		
		//Target Color and Text validation
		String color = chromeDriver.findElement(By.id("droppable")).getCssValue("color");
		String actualColor = Color.fromString(color).asHex();
		
		//String targetText;
		String actualText = chromeDriver.findElement(By.id("droppable")).getText();
		
		if(targetColor.matches(actualColor) && targetText.matches(actualText))
		{
			System.out.println("Droppable color matched," + " Actual Color: " + actualColor + "  Vs Target Color: " + targetColor);
			System.out.println("Droppable text matched, " + " Actual Text: " + actualText + "  Vs Taget Text: " + targetText);
			
		}		
		else
		{
			System.out.println("Issue with drag and drop, color and text mismatch");
		}	
		
		chromeDriver.close();
		
	}

}
