package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbutton {
ChromeDriver driver;
	
    @Before
    public void begin()
    {
    	driver=new ChromeDriver();
    	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    }
    
    @Test
    public void radiobutton()
    {
    boolean button=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/input[1]")).isSelected();
        
    	if(button)
    	{
    		System.out.println("button is selected");
    	}
    	else
    	{
    		System.out.println("button is not selected");
    	}
    }
}
