package com.sgtesting.iopackage;

import java.io.FileInputStream;

public class FIleInputStreamDemo {

	public static void main(String[] args) {
	
		readcontent();
	}

	private static void readcontent() 
	{
		FileInputStream fin=null;
		int n=0;
		try
		{
			fin=new FileInputStream("D:\\IoPackageDemo\\Sample.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char)n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
