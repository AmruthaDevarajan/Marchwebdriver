package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
WebDriver driver;

By fbemail=By.id("email");
By fbpswd=By.name("pass");
By fbloginbutton=By.name("login");


public Fbloginpage(WebDriver driver) //class name should be given here
{
	this.driver=driver;
}

public void setvalues(String email,String pswd)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswd).sendKeys(pswd);
}

public void login()
{
	driver.findElement(fbloginbutton).click();
}

}
