package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {
    ChromeDriver driver;
	
    @Before
    public void start()
    {
    	driver=new ChromeDriver();
    	driver.get("file:///C:/Users/amrut/Downloads/alert_example.html");
    }
    
    @Test
    public void test6()
    {
    	driver.findElement(By.xpath("//input[@type='button']")).click(); //or "/html/body/input[1]"
    	Alert a=driver.switchTo().alert();
    	String text=a.getText();
    	//System.out.println("text="+text);
    	a.accept();
    	if(text.equalsIgnoreCase("hello iam an alert box!"))
    	{
    		System.out.println("pass");
    	}
    	else
    	{
    		System.out.println("fail");
    	}

    	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("appu"); //or "/html/body/input[2]"
    	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kuttan"); //or "/html/body/input[3]"
    	driver.findElement(By.xpath("//input[@type='submit']")).click(); //or "/html/body/input[4]"
    }
}
