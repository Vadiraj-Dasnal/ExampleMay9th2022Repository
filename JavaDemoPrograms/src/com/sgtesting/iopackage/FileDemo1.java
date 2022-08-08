package com.sgtesting.iopackage;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		
		createfile();
		renamefile();
		deletefile();
		filecollections();
	}

	private static void createfile()
	{
		try
		{
			File f=new File("D:\\IoPackageDemo\\Test.txt");
			f.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void renamefile()
	{
		try
		{
			File f1=new File("D:\\IoPackageDemo\\Test1.txt");
			File f2=new File("D:\\IoPackageDemo\\New_Test.txt");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deletefile()
	{
		try
		{
			File f3=new File("D:\\IoPackageDemo\\Test.txt");
			boolean b=f3.delete();
			System.out.println("File Deleted? "+b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void filecollections()
	{
		try
		{
			File f4=new File("D:\\IoPackageDemo");
			File f5[]=f4.listFiles();
			for(int i=0; i<f5.length; i++)
			{
				if(f5[i].isFile()==true)
				{
					System.out.println(f5[i].getPath());
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
