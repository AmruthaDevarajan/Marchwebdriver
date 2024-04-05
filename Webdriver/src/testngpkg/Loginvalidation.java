package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys("amruthadevarajan1998@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys("Amrulink");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		String exp="https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit";
		
		String act=driver.getCurrentUrl();
		
		if(act.equals(exp))
		{
			System.out.println("login pass");
		}
		else
		{
			System.out.println("login fail");
		}
	}
}
