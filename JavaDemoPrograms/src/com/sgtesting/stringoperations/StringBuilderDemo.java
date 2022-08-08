package com.sgtesting.stringoperations;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		appendstr();
		insertstring();
		deletestring();
		reversestring();
	}
	
	private static void appendstr()
	{
		StringBuilder o=new StringBuilder("java");
		System.out.println(o);
		o.append(" program");
		System.out.println(o);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void insertstring()
	{
		StringBuilder o=new StringBuilder("It is a palace");
		StringBuilder o1=o.insert(8, "new");
		System.out.println("Inserted String: "+o1);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void deletestring()
	{
		StringBuilder s=new StringBuilder("It is a palace");
		StringBuilder s1=s.delete(8, 12);
		System.out.println("Deleted String: "+s1);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void reversestring()
	{
		StringBuilder s=new StringBuilder("java");
		System.out.println("Reverse String: "+s.reverse());
		System.out.println("+++++++++++++++++++++++++++");
	}
}
