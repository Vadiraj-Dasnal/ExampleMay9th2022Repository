package com.sgtesting.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		addelements();
		removeElements();
		readElements();
		readElements2();
		readElements3();
		enumeratorDemo();
		withoutGenerics();
	}
	
	private static void addelements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add(1,"Pineapple");
		Vector<String> obj1=new Vector<String>();
		obj1.add("Red");
		obj1.add("Blue");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements"+obj);
	}

	private static void removeElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Pineapple");
		System.out.println("Elements: "+obj);
		obj.remove(0);
		System.out.println("Elements: "+obj);
		obj.remove("Apple");
		System.out.println("Elements: "+obj);
		obj.removeAll(obj);
		System.out.println("Elements: "+obj);
	}
	
	private static void readElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add(1,"Pineapple");
		System.out.println("Elements: "+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElements2()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add(1,"Pineapple");
		System.out.println("Elements: "+obj);
		for(int i=0; i<obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElements3()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add(1,"Pineapple");
		System.out.println("Elements: "+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void enumeratorDemo()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add(1,"Pineapple");
		System.out.println("Elements: "+obj);
		Enumeration<String> ite=obj.elements();
		while(ite.hasMoreElements())
		{
			System.out.println(ite.hasMoreElements());
		}
	}
	
	private static void withoutGenerics()
	{
		Vector obj=new Vector();
		System.out.println("Elements"+obj);
		obj.add("String");
		obj.add(12);
		obj.add('c');
		obj.add(12.50);
		obj.add(true);
		System.out.println("Elements"+obj);
	}
}
