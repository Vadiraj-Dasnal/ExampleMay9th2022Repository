package com.sgtesting.Generics;
class Sample1
{
	public static <E> void displayelelements(E[] elements)
	{
		for(E element: elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericsElemetsLevel {

	public static void main(String[] args) {
		
		String s[]= {"Apple","Mango","Orange"};
		Sample1.displayelelements(s);
		
		Integer a[]= {10,20,30,40};
		Sample1.displayelelements(a);
		
		Character ch[]= {'A','B','C'};
		Sample1.displayelelements(ch);
		
	}
}
