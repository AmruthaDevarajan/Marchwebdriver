package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}
	@Test(priority = 2,invocationCount = 3) //to run this test method 3 times
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 3,enabled=false) //to skip this test method
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 1)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("aftertest");
	}

}
