package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocQ1 {
	
	public static void main(String[] args)
	{				
		//Instantiate the driver
		WebDriver fireFoxDriver = new FirefoxDriver();
		
		fireFoxDriver.manage().window().maximize();
		fireFoxDriver.get("http://google.com");
		
		System.out.println("URL of the current page is: " + fireFoxDriver.getCurrentUrl());
		
		fireFoxDriver.navigate().refresh();
		fireFoxDriver.close();
		
	}
}
