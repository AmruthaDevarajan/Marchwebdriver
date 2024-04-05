package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertest {
WebDriver driver; //driver is the reference of the interface named WebDriver

	@Parameters("browser")
	@BeforeTest
	public void SetUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))	
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	}
	@Test
	public void test()
	{
		driver.get("https://www.linkedin.com");
	}
}
