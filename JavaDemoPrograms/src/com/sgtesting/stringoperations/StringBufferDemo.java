package com.sgtesting.stringoperations;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		appendstr();
		insertstring();
		deletestring();
		reversestring();
		
	}
	private static void appendstr()
	{
		StringBuffer o=new StringBuffer("java");
		System.out.println(o);
		o.append(" program");
		System.out.println(o);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void insertstring()
	{
		StringBuffer o=new StringBuffer("It is a palace");
		StringBuffer o1=o.insert(8, "new");
		System.out.println("Inserted String: "+o1);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void deletestring()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		StringBuffer s1=s.delete(8, 12);
		System.out.println("Deleted String: "+s1);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void reversestring()
	{
		StringBuffer s=new StringBuffer("java");
		System.out.println("Reverse String: "+s.reverse());
		System.out.println("+++++++++++++++++++++++++++");
	}
}
