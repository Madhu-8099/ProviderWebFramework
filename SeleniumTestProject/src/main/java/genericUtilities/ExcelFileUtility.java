package genericUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility 
{
	public String readthedatafromExcel(String SheetName,int rowno,int cellNo) throws Throwable
	   {
		   FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\src\\main\\resources\\TestData.xlsx");
		  Workbook book = WorkbookFactory.create(fis);
		  Sheet sheet = book.getSheet(SheetName);
		 Row row = sheet.getRow(rowno);
		 Cell cel = row.getCell(cellNo);
   	 String value = cel.getStringCellValue(); 
		 return value;
	   }
	public void writedataintoExacel(String SheetName,int rowno,int cellNo) throws Throwable
	   {
		   FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\src\\test\\resources\\TestData.xlsx");
			  Workbook book = WorkbookFactory.create(fis);
			  Sheet sheet = book.getSheet(SheetName);
			  Row row = sheet.getRow(rowno);
			  Cell cel = row.createCell(cellNo);
			  
			  FileOutputStream fis1= new FileOutputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\src\\main\\resources\\TestData.xlsx");
			  book.write(fis1);
	   }
	 public int getrowcount(String sheetname) throws Throwable
	   {
		   FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\src\\main\\resources\\TestData.xlsx");
		  Workbook book = WorkbookFactory.create(fis);
		  Sheet shee= book.getSheet(sheetname);
		  int row = shee.getLastRowNum();
		  return row;
	   }
	 public Object[][] readmultipleDataFromExcel(String SheetName) throws Throwable
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\src\\main\\resources\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(SheetName);
			int lastRow = sh.getLastRowNum();
			int lastCell = sh.getRow(0).getLastCellNum();
			
			Object[][] data = new Object[lastRow][lastCell];
			
			for(int i = 0;i<lastRow;i++)
			{
				for(int j=0;j<lastCell;j++)
				{
					data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
				}
			}
			return data;
}
	 public String readthedataNumfroExcel(String SheetName,int rowno,int cellNo) throws Throwable
	   {
		   FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\src\\main\\resources\\TestData.xlsx");
		  Workbook book = WorkbookFactory.create(fis);
		  //String value = book.getSheet(SheetName).getRow(rowno).getCell(cellNo).toString();
		 // return value;
		  Sheet sheet = book.getSheet(SheetName);
		 Row row = sheet.getRow(rowno);
	     Cell cel = row.getCell(cellNo); 
		 double numvalue=cel.getNumericCellValue();
		 int intval=(int)numvalue;
		 Integer ival=(Integer)intval;
		 String strvalue=ival.toString();
		 return strvalue;
	   }
}
