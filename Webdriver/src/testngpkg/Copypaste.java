package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
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
	public void test1()
	{
		WebElement firstname=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input"));
		WebElement rediffid=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input"));
		firstname.sendKeys("hello");
		Actions act=new Actions(driver);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
}
