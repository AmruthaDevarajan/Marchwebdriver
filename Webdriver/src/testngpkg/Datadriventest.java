package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\amrut\\Downloads\\Book4.xlsx"); //reads excel sheet
		XSSFWorkbook wb=new XSSFWorkbook(f); //workbook-all sheets
		XSSFSheet sh=wb.getSheet("Sheet1"); //sheet details
		int row=sh.getLastRowNum(); //row details
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue(); //i and 0 are indexes of row and column respectively
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username +"\n"+"password="+password);
			
			driver.get("https://www.linkedin.com");
			driver.findElement(By.xpath("//*[@id=\"session_key\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"session_password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		}
		
		
	}

}
