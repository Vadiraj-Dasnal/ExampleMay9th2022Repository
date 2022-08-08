package com.sgtesting.iopackage;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		writecontent();
	}
	
	private static void writecontent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\IoPackageDemo\\Sample.txt");
			fw.write("Bangalore is a garden city");
			fw.write("Bangalore is a electronic city");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
