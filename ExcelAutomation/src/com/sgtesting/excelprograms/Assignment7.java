package com.sgtesting.excelprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment7 {

	public static void main(String[] args) {
		
		readandwritedemo();
	}
	private static void readandwritedemo()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb1=null;
		Workbook wb2=null;
		Sheet wb1sh1=null;
		Sheet wb2sh1=null;
		Row wb1sh1row=null;
		Row wb2sh1row=null;
		Cell wb1sh1cell=null;
		Cell wb2sh1cell=null;
		try
		{
			fin=new FileInputStream("C:\\ExcelFiles\\Assignment7.xlsx");
			wb1=new XSSFWorkbook(fin); 
			wb2=new XSSFWorkbook();
			wb1sh1=wb1.getSheet("Sheet1");
			wb2sh1=wb2.getSheet("Sheet1");
			if(wb2sh1==null)
			{
				wb2sh1=wb2.createSheet("Sheet1");
			}
			int rc=wb1sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				wb1sh1row=wb1sh1.getRow(r);
				wb2sh1row=wb2sh1.getRow(r);
				if(wb2sh1row==null)
				{
					wb2sh1row=wb2sh1.createRow(r);
				}
				int cc=wb1sh1row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					wb1sh1cell=wb1sh1row.getCell(c);
					String data=wb1sh1cell.getStringCellValue();
					wb2sh1cell=wb2sh1row.getCell(c);
					if(wb2sh1cell==null)
					{
						wb2sh1cell=wb2sh1row.createCell(c);
					}
					wb2sh1cell.setCellValue(data);
					System.out.print(data+" ");
				}
				System.out.println();
			}
			fout=new FileOutputStream("C:\\ExcelFiles\\Assignment71.xlsx");
			wb2.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb1.close();
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

