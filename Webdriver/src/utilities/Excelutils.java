package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public static String getCellValue(String x1, String Sheet, int r, int c)
	{
		try
		{
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				double v=cell.getNumericCellValue(); //return type of getNumericCellValue is double
				int val=(int)v; //typecasting
				return String.valueOf(val); //bcz, integer values cannot be passed to sendKeys().
				//return cell.getRawValue();
			}
		}
		 catch(Exception e)
		{
			 return " ";
		}
	}
		

	public static int getRowCount(String x1, String sheet) {
		try
		{
			//File f=new File(x1);
			FileInputStream fi=new FileInputStream(x1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
		return 0;
		}
	}
}
