package com.sgtesting.iopackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		serializableDemo();
	}
	private static <Employee> void serializableDemo()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee obj=null;
		try
		{
			fout=new FileOutputStream("D:\\IoPackageDemo\\Employee.txt");
			out=new ObjectOutputStream(fout);
			obj=new Employee("Santosh","19");
			out.writeObject(obj);
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
