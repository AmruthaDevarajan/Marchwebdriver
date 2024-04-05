package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest extends Baseclass1{

	
	@Test
	public void fbtest()
	{
		
		Fbloginpage ob=new Fbloginpage(driver); //created object for Fbloginpage class
		ob.setvalues("abc@gmail.com","abc123");
		ob.login();
	}
}
