package com.sgtesting.stringoperations;

public class PreDefinedMethods {

	public static void main(String[] args) {
		
		concatstr();
		strlength();
		isemptystring();
		extractchar();
		charArray();
		extractstring();
		replaceDemo();
		existanceofstring();
		comparestring();
		splitDemo();
		findstringposition();
		lowercase();
		uppercase();
		converttostring();
	}
	
	private static void concatstr()
	{
		String s1="JAVA";
		String s2=s1.concat(" PROGRAM");
		System.out.println("Concat String: "+s2);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void strlength()
	{
		String s1="JAVA";
		System.out.println("Length: "+s1.length());
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void isemptystring()
	{
		String s1="JAVA";
		System.out.println("Is empty String: "+s1.isEmpty());
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	private static void extractchar()
	{
		String s1="JAVA";
		char ch=s1.charAt(1);
		System.out.println("Exctracted char: "+ch);
		System.out.println("+++++++++++++++++++++++");
	}
	
	private static void charArray()
	{
		String s1="PROGRAM";
		char ch[]=s1.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch);
		}
		System.out.println("+++++++++++++++++++++++");
	}
	
	private static void extractstring()
	{
		String s1="Programming";
		System.out.println("Extract approach: "+s1.substring(3));
		System.out.println("Extract approach 2: "+s1.substring(1));
		System.out.println("+++++++++++++++++++++++");
	}
	
	private static void replaceDemo()
	{
		String s=new String("It is a palace");
		System.out.println("Replaced String: "+s.replace("is", "was"));
		System.out.println("+++++++++++++++++++++++++");
	}
	
	private static void existanceofstring()
	{
		String s=new String("It is a palace");
		System.out.println("Starts with: "+s.startsWith("It"));
		System.out.println("Contatins: "+s.contains("is"));
		System.out.println("Ends with: "+s.endsWith("palace"));
		System.out.println("+++++++++++++++++++++++++++++++");
	}
	
	private static void comparestring()
	{
		String s1=new String("JavaScript");
		String s2=new String("JAVASCRIPT");
		System.out.println("Is s1 and s2 are equal"+s1.equals(s2));
		System.out.println("Is s1 and s2 are equal"+s1.equalsIgnoreCase(s2));
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
	
	private static void splitDemo()
	{
		String s1=new String("Apple, Orange, Mango");
		String s[]=s1.split(",");
		for(String kk:s)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++++++++++++++++");
	}
	
	private static void findstringposition()
	{
		String s="It is a new palace is";
		System.out.println("position of is: "+s.indexOf("is"));
		System.out.println("position of is: "+s.lastIndexOf("is"));
		System.out.println("++++++++++++++++++++++++++++++");
	}
	
	private static void lowercase()
	{
		String s1="ArraY";
		System.out.println("Lower case: "+s1.toLowerCase());
		System.out.println("++++++++++++++++++++++++++++++");
	}
	
	private static void uppercase()
	{
		String s1="array";
		System.out.println("Upper case: "+s1.toUpperCase());
		System.out.println("++++++++++++++++++++++++++++++");
	}
	
	private static void converttostring()
	{
		double d=12.15;
		String s1=String.valueOf(d);
		System.out.println(s1);
		boolean b=true;
		String s2=String.valueOf(b);
		System.out.println(s2);
		System.out.println("++++++++++++++++++++++++++++++");
		
	}
}
