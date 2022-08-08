package com.sgtesting.threadenvironment;

public class WrapperAutoBoxingDemo {

	public static void main(String[] args) {
		
		//Primitive variable declaration
		int a=125;
		System.out.println("int a: "+a);
		//convert primitive to wrapper object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b: "+b);
		//Autoboxing example
		Integer c=a;
		System.out.println("Integer c: "+c);
		
	}
}
