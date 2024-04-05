package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    ChromeDriver driver;
    
    @Before
    public void begin()
    {
    	driver=new ChromeDriver();
    	driver.get("https://www.facebook.com");
    }
    
    @Test
    public void test2()
    {
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anfrthj@gmail.com");
    	//driver.findElement(By.name("email")).sendKeys("anfrthj@gmail.com"); --without xpath
    	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123dfgh");
    	//driver.findElement(By.id("pass")).sendKeys("123dfgh"); --without xpath
    	driver.findElement(By.xpath("//button[@name='login']")).click();
    	//driver.findElement(By.name("login")).click(); --without xpath
    }
    
}
