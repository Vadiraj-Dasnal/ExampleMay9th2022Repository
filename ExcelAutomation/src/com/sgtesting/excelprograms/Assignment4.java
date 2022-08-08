package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment4 {

	public static void main(String[] args) {
		
		WriteContent();
	}
	private static void WriteContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		
		try
		{
			fout=new FileOutputStream("C:\\ExcelFiles\\Assignment4.xlsx");
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Citynames");
			for(int i=0; i<20; i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				{
					cell.setCellValue("CityName"+(i+1));		
				}
			}
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
