package com.sgtesting.iopackage;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {

		//createfolder();
		//createNestedFolder();
		//renamefolder();
		//deletefolder();
		foldercollections();
	}
	
	private static void createfolder()
	{
		File f=new File("D:\\IoPackageDemo\\Test");
		f.mkdir();
	}
	
	private static void createNestedFolder()
	{
		File f1=new File("D:\\IoPackageDemo\\Test\\Test1\\Test2");
		f1.mkdirs();
	}
	
	private static void renamefolder()
	{
		File f2=new File("D:\\IoPackageDemo\\Test");
		File f3=new File("D:\\IoPackageDemo\\Test_new");
		f2.renameTo(f3);
	}
	
	private static void deletefolder()
	{
		File f4=new File("D:\\IoPackageDemo\\Test_new\\Test1\\Test2");
		boolean b=f4.delete();
		System.out.println(b);
	}
	
	private static void foldercollections()
	{
		File f5=new File("D:\\IoPackageDemo");
		File f6[]=f5.listFiles();
		for(int i=0; i<f6.length; i++)
		{
			if(f6[i].isFile()==true)
			{
				System.out.println(f6[i].getPath());
			}
		}
	}
}
