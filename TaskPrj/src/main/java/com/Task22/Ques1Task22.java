package com.Task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ques1Task22 {
	
	public static void main(String[] args) throws IOException
	{
		WebDriver chromeDriver = new ChromeDriver();
		String expSuccessMsg = "Thank you!";
		
		//Open URL
		chromeDriver.get("https://phptravels.com/demo/");
		
		//Maximize the window
		chromeDriver.manage().window().maximize();
		
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Fill the form details
		chromeDriver.findElement(By.name("first_name")).sendKeys("Jessy");
		
		chromeDriver.findElement(By.name("last_name")).sendKeys("Robert");
		
		chromeDriver.findElement(By.name("business_name")).sendKeys("JessyRobert");
		
		chromeDriver.findElement(By.name("email")).sendKeys("jessytest@test.com");		
			
		String num1 = chromeDriver.findElement(By.id("numb1")).getText();		
			
		String num2 = chromeDriver.findElement(By.id("numb2")).getText();
		
				
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		String result = Integer.toString(sum);		
				
		WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("number")));
		
		chromeDriver.findElement(By.id("number")).sendKeys(result);		
				
		chromeDriver.findElement(By.id("demo")).click();	
		
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = chromeDriver.findElement(By.xpath("(//h2[@class='text-center cw mt-3'])//strong"));
		
		
		String actualSucMsg = element.getAttribute("innerText").trim();
		//String actualSucMsg = element.toString();
		
		System.out.println("Text is " + actualSucMsg);
		
		if(expSuccessMsg.equals(actualSucMsg))
		{
			System.out.println("Successfully Signed in");
		}
		
		WebDriverWait wait1 = new WebDriverWait(chromeDriver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@class='text-center cw mt-3'])//strong")));		
		
		TakesScreenshot screenshot = ((TakesScreenshot) chromeDriver);
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);

		// Mention the destination
		File dest = new File("C:\\Users\\rajie\\eclipse-workspace\\TaskPrj\\src\\main\\java\\com\\Task22\\SS1.png");

		// Copy from source to destination
		FileUtils.copyFile(source, dest);
		
		chromeDriver.close();
	}

}
