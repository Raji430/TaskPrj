package tasksSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiate the browser
		ChromeDriver driver = new ChromeDriver();
		WebElement element;
		
		//Provide the input URL to open
		driver.get("https://google.com");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		element = driver.findElement(By.name("q"));;
		element.sendKeys("Selenium Browser Driver");
		element.submit();		
			
		//Close the browser session
		driver.quit();
		
	}

}
