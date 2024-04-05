package pkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	EdgeDriver driver;
	
	@BeforeTest
	public void Beforetest()
	{
		driver=new 	EdgeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/popup.php");
		
		String parentWindow=driver.getWindowHandle(); //details of current window
		
		System.out.println("Parent Window Title - "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles(); //details of all windows //Set cannot store duplicate values
		
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle); //if window not equal to parent window, switch to it
				
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				System.out.println(s);
				driver.close(); //'close' is used to close current tab whereas 'quit' closes entire browser
			}
			
			driver.switchTo().window(parentWindow);
		}
	}

}
