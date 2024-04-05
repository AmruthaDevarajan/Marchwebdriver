package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
ChromeDriver driver;
	
    @Before
    public void begin()
    {
    	driver=new ChromeDriver();
    	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    }
    
    @Test
    public void test5()
    {
    	boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
        
    	if(logo)
    	{
    		System.out.println("logo is present");
    	}
    	else
    	{
    		System.out.println("logo is not present");
    	}
    }
}
