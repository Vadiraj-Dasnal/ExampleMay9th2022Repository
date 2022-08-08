package com.sgtesting.threadenvironment;

public class WrapperUnboxing {

	public static void main(String[] args) {
		
		//wrapper object
		Integer a=Integer.valueOf(100);
		System.out.println("Integer a: "+a);
		//store the wrapper object in premitive
		int b=a.intValue();
		System.out.println("int b: "+b);
		//unboxing example
		int c=a;
		System.out.println("int c: "+c);
		
	}
}
