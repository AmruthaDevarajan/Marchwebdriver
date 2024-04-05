package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisation {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Parameters("search")
	@Test
	public void test1(String s) //string in "search" is coming to s
	{
		driver.findElement(By.name("q")).sendKeys(s);
	}

}

//run from xml