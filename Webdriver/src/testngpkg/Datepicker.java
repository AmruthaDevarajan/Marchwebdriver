package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;	
	String baseurl="https://www.expedia.com/?pwaLob=wizard-flight-pwa";
	
	@BeforeTest
	public void setUp()
	{
		
		
		 driver=new ChromeDriver(); //SUCCESS OUTPUT
	
	}
	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void testlogin()
	{
		
		driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div/div/div/button")).click();
		
		 while(true)
		 {
		WebElement month=driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/span"));
			
			  String month1=month.getText();
				if(month1.equals("January 2024"))
				{
					System.out.println(month1);
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[2]/button")).click();
				}
		
		 }
		
	List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/table/tbody/tr/td/div"));
	
	for(WebElement dateelement:alldates1)
	{
		String date=dateelement.getText();
		//System.out.println(date);
		if(date.equals("24"))
		{
			System.out.println(date);
			dateelement.click();
			System.out.println("date selected");
		}
		
	}
}
}
