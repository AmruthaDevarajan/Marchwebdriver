package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	
    @Before
    public void begin()
    {
    	driver=new ChromeDriver();
    	driver.get("https://www.amazon.in");
    }
    
    @Test
    public void test3()
    {
    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
    	driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
    	driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]")).click(); //or can try with giving <a tag directly
    	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vgbhj@gmail.com");
    	driver.findElement(By.xpath("//input[@id='continue']")).click();
    	driver.navigate().back();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[7]")).click();
    	driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a[1]")).click(); //or can try with giving <a tag directly
    }

}
