package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verification {
	ChromeDriver driver;
	@BeforeTest(alwaysRun = true)
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}
	@Test(priority = 2,groups = {"sanity"})
	public void pagetitle()
	{
		String actualtitle=driver.getTitle();
		String exp="Google.com";
        if(actualtitle.equals(exp))
        {
        System.out.println("pass");
        }
       else
        {
        System.out.println("fail");
         }
     }
	@Test(priority=1,groups = {"sanity"})
	public void pagesource()
	{
		String src=driver.getPageSource();
        if(src.contains("Gmail"))
       {
       System.out.println("present");
       }
       else
       {
       System.out.println("not present");
       }
     }
	@Test(priority = 3,groups = {"smoke"})
	public void entervalue()
	{
		driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	}
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("verification done");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("Process complete");
	}

}
