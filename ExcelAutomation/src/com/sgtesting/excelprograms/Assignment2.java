package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment2 {

	public static void main(String[] args) {
		
		Writecontent();

	}
	private static void Writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		
		try
		{
			fout=new FileOutputStream("C:\\ExcelFiles\\Assignment2.xlsx");
			wb=new XSSFWorkbook();
			sh=wb.createSheet("FlowerNames");
			row=sh.createRow(9);
			for(int c=0; c<=20; c++)
			{
				cell=row.createCell(c);
				cell.setCellValue("FlowerName"+c);
			}wb.write(fout);
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
