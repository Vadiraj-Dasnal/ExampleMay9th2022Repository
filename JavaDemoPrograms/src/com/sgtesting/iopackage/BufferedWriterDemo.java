package com.sgtesting.iopackage;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		bufferedwriter();
	}
	
	private static void bufferedwriter()
	{
		BufferedWriter bw=null;
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\IoPackageDemo\\Sample1.txt");
			bw=new BufferedWriter(fw);
			bw.write("Rice grown in GVT are transfered all over the world");
			bw.newLine();
			bw.write("People like it.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
