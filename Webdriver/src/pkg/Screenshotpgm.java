package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
ChromeDriver driver;
	
    @Before
    public void start()
    {
    	driver=new ChromeDriver();
    	driver.get("file:///C:/Users/amrut/Downloads/alert_example.html");
    }
    
    @Test
    public void scrnsht() throws IOException
    {
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src, new File("D://screenshot1.png")); //storing to D drive
    
    WebElement button=driver.findElement(By.xpath("//input[@type='button']")); //xpath of display alert box
    File src1=button.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src1, new File("./Screenshot/error.png")); //storing to a working directory in project
    }
}
