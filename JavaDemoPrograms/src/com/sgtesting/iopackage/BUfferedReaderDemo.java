package com.sgtesting.iopackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class BUfferedReaderDemo {

	public static void main(String[] args) {
		
		readcontent();
	}
	
	private static void readcontent()
	{
		BufferedReader br=null;
		FileReader fr=null;
		try
		{
			fr=new FileReader("D:\\IoPackageDemo\\Sample1.txt");
			br=new BufferedReader(fr);
			String sline=null;
			while((sline=br.readLine())!=null)
			{
				System.out.println(sline);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
