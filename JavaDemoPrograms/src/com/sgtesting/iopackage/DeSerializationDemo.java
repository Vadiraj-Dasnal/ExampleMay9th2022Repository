package com.sgtesting.iopackage;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {

		Deserialization();
	}
	
	private static <Employee> void Deserialization()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream("D:\\IoPackageDemo\\Employee.txt");
			in=new ObjectInputStream(fin);
			Employee obj=(Employee)in.readObject();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
