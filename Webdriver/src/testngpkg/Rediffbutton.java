package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffbutton {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void compare()
	{
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		if(button.getAttribute("value").matches("Check availability"))
		{
			System.out.println("Text is same");
		}
		else
		{
			System.out.println("Text is not same");
		}
	}
	
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("test is successful");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
