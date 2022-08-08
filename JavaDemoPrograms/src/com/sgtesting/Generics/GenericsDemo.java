package com.sgtesting.Generics;
class Myclass<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return obj;
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		
		//with generics
		Myclass<Integer> obj1=new Myclass<Integer>();
		obj1.add(100);
		int a=obj1.get();
		System.out.println("Int a: "+a);
		obj1.add(200);
		int b=obj1.get();
		System.out.println("Int b: "+b);
		obj1.add(300);
		int c=obj1.get();
		System.out.println("Int c: "+c);
		obj1.add(400);
		int d=obj1.get();
		System.out.println("Int d: "+d);
		
	}
}
