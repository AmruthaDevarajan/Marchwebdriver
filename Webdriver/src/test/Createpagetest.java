package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Createpage;

public class Createpagetest extends Baseclass1{

	
	@Test
	public void createpagettest()
	{
		Createpage cp=new Createpage(driver);
		cp.clickcreatepage();
		cp.getstartedclick();
	}
}
