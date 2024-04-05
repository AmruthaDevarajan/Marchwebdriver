package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Expediapage;

public class Expediatest {

WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com/"); //NEED TO EDIT. DON'T STUDY THIS FULL CODE
	}
	
	@Test
	public void expediawork()
	{
		
		Expediapage ep=new Expediapage(driver); 
		ep.setplaces("kochi");
		ep.clicktraveller();
		ep.chooseage();
		ep.childropdown();
		ep.clickdone();
		ep.dateclick();
		ep.choosedate();
		ep.datedonebutton();
		ep.searchbutton();
	}

}
