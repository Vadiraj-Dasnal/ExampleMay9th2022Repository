package com.sgtesting.excelprograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment1 {

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
			fout=new FileOutputStream("C:\\ExcelFiles\\Assignment1.xlsx");
			wb=new XSSFWorkbook();
			sh=wb.createSheet("FruitNames");
			for(int r=0;r<20;r++)
			{
				row=sh.createRow(r);
				cell=row.createCell(0);
				cell.setCellValue("FruitName"+(r+1));
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
