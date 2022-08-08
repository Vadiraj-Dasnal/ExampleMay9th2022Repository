package com.sgtesting.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;


public class LinkedlistDemo {
	public static void main(String[] args) {
		
		addelements();
		removeElements();
		readelements();
		readelements1();
		readelements3();
		ListIteratorDemo();
		withoutgenerics();
		firstinfirstout();
	}
	
	private static void addelements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Banana");
		obj.add(1,"Grapes");
		obj.add("Pineapple");
		System.out.println("Elements: "+obj);
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Blue");
		obj1.add("Green");
		obj1.add("White");
		obj1.addAll(obj);
		System.out.println("Elements: "+obj1);
	}
	
	private static void removeElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements: "+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(2,"Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("PinaApple");
		System.out.println("Elements: "+obj);
		obj.remove("Apple");
		obj.remove(3);
		System.out.println("Elements: "+obj);
		obj.removeAll(obj);
		System.out.println("Elements: "+obj);
	}
	
	private static void readelements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements: "+obj);
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Orange");
		obj.add(0, "Banana");
		obj.add("Pineapple");
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readelements1()
	{
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		obj.addFirst("Strawberry");
		obj.add(1,"Cherry");
		for(int i=0; i<obj.size(); i++)
		{
			System.out.print(obj.get(i)+" ");
		}
	}
	
	private static void readelements3()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements: "+obj);
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Pineapple");
		obj.add("Cherry");
		obj.add(1,"Banana");
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void ListIteratorDemo()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements: "+obj);
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("PineApple");
		obj.add("Orange");
		System.out.println("Elements: "+obj);
		ListIterator<String> list=obj.listIterator();
		System.out.println("Forward Direction");
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("Backward Direction");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}
	
	private static void withoutgenerics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements: "+obj);
		obj.add("Apple");
		obj.add('A');
		obj.add(10.05);
		obj.add(15);
		obj.add(true);
		System.out.println("Elements: "+obj);
	}
	
	private static void firstinfirstout()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements: "+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		System.out.println("Elements: "+obj);
		
	}
}
