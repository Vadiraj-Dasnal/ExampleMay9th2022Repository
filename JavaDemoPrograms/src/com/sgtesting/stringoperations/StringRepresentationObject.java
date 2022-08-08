package com.sgtesting.stringoperations;

class Sample
{
	String firstname;
	int age;
	Sample(String fn,int ag)
	{
		firstname=fn;
		age=ag;
	}
	public String tostring()
	{
		return "FirstName: "+firstname+"and age is: "+age;
	}
}
public class StringRepresentationObject {
	public static void main(String[] args) {
		
		Sample o=new Sample("Santosh",19);
		System.out.println(o);
		
	}
}
