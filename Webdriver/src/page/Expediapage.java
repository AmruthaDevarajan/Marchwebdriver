package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Expediapage {

	WebDriver driver;
	
	
	By goingto=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[2]/form/div/div/div[1]/div/div/div[2]/div[1]/button");
	By traveller=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[1]/button");
	By adults=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[2]");
	By children=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[2]/div[1]/div/button[2]");
	By childage=By.xpath("//*[@id=\"age-traveler_selector_children_age_selector-0-0\"]");
	By donebutton=By.xpath("//*[@id=\"traveler_selector_done_button\"]");
	//By economy=By.xpath("//*[@id=\"cabin_class\"]/span");
	//By economyoption=By.xpath("//*[@id=\"cabin_class_menu\"]/div/div/button[1]/span");
	By dates=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div/div/div/button");
	By datenumber=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/table/tbody/tr[4]/td[6]/div/div[2]");
	By datedone=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/footer/div/button");
	By search=By.xpath("//*[@id=\"search_button\"]");
	
public Expediapage(WebDriver driver)
	{
		this.driver=driver;  //NEED TO EDIT. DON'T STUDY THIS FULL CODE
	}
	


public void setplaces(String goingplace)
{
	
	driver.findElement(goingto).sendKeys(goingplace);
	driver.findElement(goingto).sendKeys(Keys.ENTER);
}

public void clicktraveller()
{
	driver.findElement(traveller).click();
	driver.findElement(adults).click();
	driver.findElement(children).click();
	driver.findElement(childage).click();
}

public void chooseage()
{
	driver.findElement(childage).click();
}

public void childropdown()
{
	WebElement age=driver.findElement(childage);
	Select s=new Select(age);
	s.selectByValue("3");
}

public void clickdone()
{
	driver.findElement(donebutton).click();
}

public void dateclick()
{
	driver.findElement(dates).click();
}

public void choosedate()
{
	while(true)
	 {
	WebElement month=driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/span"));
		
		  String month1=month.getText();
			if(month1.equals("January 2024"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[2]/button")).click();
			}
	
	 }
	
List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[2]/div/div/div[3]/div/div[1]/table/tbody/tr/td/div/div[2]"));

for(WebElement dateelement:alldates1)
{
	String date=dateelement.getText();
	//System.out.println(date);
	if(date.equals("28"))
	{
		System.out.println(date);
		dateelement.click();
		System.out.println("date selected");
	}
	
}
}

public void datedonebutton()
{
	driver.findElement(datedone).click();
}

public void searchbutton()
{
	driver.findElement(search).click();
}
}
