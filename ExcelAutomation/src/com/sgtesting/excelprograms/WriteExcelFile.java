package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) {
		writecontent();

	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fout=new FileOutputStream("C:\\ExcelFiles\\WriteContent.xlsx");
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Credentials");
			//First row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue("password");
			//Second row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("DemoUser1");
			cell=row.createCell(1);
			cell.setCellValue("Welcome@123");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

