package webProjects;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException
	{
	HSSFWorkbook workbook=new HSSFWorkbook();
	HSSFSheet sheet=workbook.createSheet();
	sheet.createRow(3);
	sheet.getRow(3).createCell(3).setCellValue("madhu");
	sheet.getRow(3).createCell(4).setCellValue("world");
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("MyCLNQ");
	sheet.getRow(1).createCell(1).setCellValue("madhu");
	
	File file=new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumTestProject\\ExcelFile\\TestData.xlsx");
    workbook.write(file);
    workbook.close();

	}

}
