package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocQ2 {
	
	public static void main(String[] args)
	{
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.demoblaze.com");
		
		chromeDriver.manage().window().maximize();
		String title = chromeDriver.getTitle();
		
		if(title.contentEquals("STORE"))
		{
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page landed on correct website");
		}
		
		chromeDriver.close();
	}

}
