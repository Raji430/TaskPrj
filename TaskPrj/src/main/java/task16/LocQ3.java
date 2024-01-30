package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocQ3 {
	
	public static void main(String[] args)
	{
		//Instantiate the driver
		WebDriver driver = new ChromeDriver();
		
		WebElement element;
		
		//Open wikipedia page
		driver.get("https://www.wikipedia.org");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		element = driver.findElement(By.id("searchInput"));
		element.sendKeys("Artificial Intelligence");
		element.submit();
		
		element = driver.findElement(By.id("ca-history"));
		element.click();		
			
		System.out.println("Title of the section is: " + driver.getTitle());
		
		driver.close();
		
	}

}
