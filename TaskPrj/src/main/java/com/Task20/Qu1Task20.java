package com.Task20;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Qu1Task20 {
	
	public static void main(String[] args) throws InterruptedException, UnsupportedFlavorException, IOException
	{
		WebDriver chromeDriver = new  ChromeDriver();
		
		//Open the URL
		chromeDriver.get("https://jqueryui.com/datepicker");
		
		//Maximize the browser
		chromeDriver.manage().window().maximize();
		
		//Switch to frame
		chromeDriver.switchTo().frame(0);
		
		//Select the next month
		chromeDriver.findElement(By.id("datepicker")).click();
		
		chromeDriver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();		
		
		Thread.sleep(500);
		
		//Choose the date as 22
		chromeDriver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr[4]//td[6]")).click();
				
		Thread.sleep(1000);
				
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		Clipboard clipboard = toolkit.getSystemClipboard();
	    String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);		
		
	    //Print the chosen date
		System.out.println("Selected Date is: " + actualCopedText);		
		
		//Close the browser
		chromeDriver.close();
		
		//Kills the process
		chromeDriver.quit();		
		
	}

}
