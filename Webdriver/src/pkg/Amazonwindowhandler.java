package pkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindowhandler {
	ChromeDriver driver;
	
	@BeforeTest
	public void Beforetest()
	{
		driver=new 	ChromeDriver();
		driver.manage().window().maximize();  
	}
	
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.amazon.in/");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window Title - "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles(); 
		
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle); 
				
				JavascriptExecutor js = (JavascriptExecutor) driver; //to scroll window up
				js.executeScript("window.scrollBy(0,500)");
				driver.findElement(By.xpath("//*[@id='desktop_qualifiedBuyBox']/div[1]/div[37]/div[1]/span/span/span/input")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		/*Set<String> allWindows=driver.getWindowHandles(); 
		for(String handlec:allWindows)
		{
			if(!handlec.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handlec); 
				driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
			}
		}*/
		
		driver.switchTo().window(parentWindow);
	}
}


