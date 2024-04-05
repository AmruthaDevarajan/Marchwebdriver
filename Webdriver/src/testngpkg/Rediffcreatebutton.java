package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffcreatebutton {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void button()
	{
		Boolean createbutton=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isDisplayed();
		Assert.assertTrue(createbutton);
		System.out.println("successful");
		
	}
}
