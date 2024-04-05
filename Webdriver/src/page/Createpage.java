package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
	
WebDriver driver;

By createpagelink=By.xpath("//*[@class='_8esh']");
By getstartedbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");

public Createpage(WebDriver driver) //class name should be given here
{
	this.driver=driver;
}

public void clickcreatepage()
{
	driver.findElement(createpagelink).click();	
}

public void getstartedclick()
{
	driver.findElement(getstartedbutton).click();
}
}
