package com.sgtesting.iopackage;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		writecontent();
	}

	private static void writecontent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\IoPackageDemo\\Sample.txt", true);
			String str="Bangalore is capital city of karnataka. ";
			str+="Bangalore is a garden city.";
			byte b[]=str.getBytes();
			fout.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
