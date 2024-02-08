package com.Task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3Task21 {
	
	public static void  main(String[] args) throws InterruptedException
	{
		WebDriver chrDriver = new ChromeDriver();
		int expectedTopFrameSize = 3;
		String left = "LEFT", middle = "MIDDLE", right = "RIGHT", bottom = "BOTTOM";
		
		//Open the URL
		chrDriver.get("http://the-internet.herokuapp.com/nested_frames");
		
		//Maximize the window
		chrDriver.manage().window().maximize();
		
		Thread.sleep(500);
		
		//Switch to Top Frame
		chrDriver.switchTo().frame("frame-top");	
		
		//Get the size, compare and print the no. of frames inside top frame
		
		int topFrameSize = chrDriver.findElements(By.tagName("frame")).size();
		
		if(topFrameSize == expectedTopFrameSize)
		{
		System.out.println("Total Number of frames inside top frame is: " + topFrameSize);
		}
		
		//Switch to Left frame
		chrDriver.switchTo().frame("frame-left");
		
		//Validate the text "LEFT"
		String leftFrameText = chrDriver.findElement(By.xpath("//body")).getText();
		if(leftFrameText.equals(left))
		{
		System.out.println("Left Frame Text is: " + leftFrameText);
		}
		
		//Switch back to top frame
		chrDriver.switchTo().parentFrame();		
		//Switch to Middle frame
		chrDriver.switchTo().frame("frame-middle");				
		//Validate the text "MIDDLE"
		String middleFrameText = chrDriver.findElement(By.xpath("//body")).getText();
		if(middleFrameText.equals(middle))
		{
		System.out.println("Left Frame Text is: " + middleFrameText);
		}
		
		//Switch back to top frame
		chrDriver.switchTo().parentFrame();				
		//Switch to RIGHT frame
		chrDriver.switchTo().frame("frame-right");						
		//Validate the text "RIGHT"
		String rightFrameText = chrDriver.findElement(By.xpath("//body")).getText();
		if(rightFrameText.equals(right))
		{
		System.out.println("Left Frame Text is: " + rightFrameText);
		}
				
		//Exit from frames
		chrDriver.switchTo().defaultContent();				
		//Switch to BOTTOM frame
		chrDriver.switchTo().frame("frame-bottom");								
		//Validate the text "BOTTOM"
		String bottomFrameText = chrDriver.findElement(By.xpath("//body")).getText();
		if(bottomFrameText.equals(bottom))
		{
		System.out.println("Left Frame Text is: " + bottomFrameText);
		}
		
		//Switch back to top frame
		chrDriver.switchTo().defaultContent();				
		//Switch to top frame
		chrDriver.switchTo().frame("frame-top");
		
		//Web Page Title is empty no Frames is seen as per the task
		String title = chrDriver.getTitle();
		System.out.println("Page Title is: " + title);
		
		chrDriver.close();
		
	}

}
