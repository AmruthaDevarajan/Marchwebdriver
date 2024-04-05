package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
ChromeDriver driver;
	
    @Before
    public void begin()
    {
    	driver=new ChromeDriver();
    	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    }
    
    @Test
    public void dropdown()
    {
    	WebElement day=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[1]"));
    	Select daydetails=new Select(day); //creating object of SELECT class
    	daydetails.selectByValue("04"); //or daydetails.selectByVisibleText("04");
    	
    	WebElement month=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[2]"));
    	Select monthdetails=new Select(month); //creating object of SELECT class
    	monthdetails.selectByVisibleText("JAN");
    	
    	WebElement year=driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[22]/td[3]/select[3]"));
    	Select yeardetails=new Select(year); //creating object of SELECT class
    	yeardetails.selectByVisibleText("2013");
    	
    	List<WebElement>li=daydetails.getOptions();
    	System.out.println("count of day="+li.size());
    	
    	List<WebElement>ai=monthdetails.getOptions();
    	System.out.println("count of months="+ai.size());
    	
    	List<WebElement>bi=yeardetails.getOptions();
    	System.out.println("count of years="+bi.size());
    }
}
