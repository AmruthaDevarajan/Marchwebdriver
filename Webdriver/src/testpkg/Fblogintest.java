package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbloginpage;
import utilities.Excelutils;

public class Fblogintest extends Baseclass{
	
	@Test
	public void verifyLoginWithValidCred()
	{
		Fbloginpage p1=new Fbloginpage(driver);
		String x1="C:\\Users\\amrut\\Downloads\\Book1.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutils.getCellValue(x1,Sheet,i,0);
			System.out.println("username---"+UserName);
			String Pwd=Excelutils.getCellValue(x1,Sheet,i,1);
			System.out.println("password---"+Pwd);
			p1.setvalues(UserName, Pwd);
			p1.login();
			
			String expectedurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA1ODM1OTU5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
			String actualurl=driver.getCurrentUrl();
			
			if(actualurl.equals(expectedurl))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
	}

	
	
}

