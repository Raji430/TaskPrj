package com.Task21;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1Task21 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver chromeDriver = new ChromeDriver();
		
		//Open the URL
		chromeDriver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement element = chromeDriver.findElement(By.id("mce_0_ifr"));
		chromeDriver.switchTo().frame(element);
		
		chromeDriver.findElement(By.tagName("p")).clear();
		
		Thread.sleep(500);
		chromeDriver.findElement(By.tagName("p")).sendKeys("Hello People");
		chromeDriver.close();
	}

}
