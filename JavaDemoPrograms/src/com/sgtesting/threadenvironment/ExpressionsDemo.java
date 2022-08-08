package com.sgtesting.threadenvironment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsDemo {

	public static void main(String[] args) {
		
		//matchesDemo();
		//finddemo1();
		//countofmatches();
		//displayMatches();
		//positionofmatches();
		//replaceDemo();
		//splitDemo();
		
	}
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("JAVA");
		Matcher match=pattern.matcher("Java");
		boolean val=match.matches();
		System.out.println(val);
	}
	
	private static void finddemo1()
	{
		Pattern pattern=Pattern.compile("JAVA");
		Matcher match=pattern.matcher("JAVA JDK JVM Java JRE ");
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void countofmatches()
	{
		Pattern pattern=Pattern.compile("JAVA");
		Matcher match=pattern.matcher("JAVA Java JRE JAVA JVM JDK" );
		int count=0;
		while(match.find())
		{
			count=count+1;
		}
		System.out.println("# of occurance "+count);
	}
	
	private static void displayMatches()
	{
		Pattern pattern=Pattern.compile("JAVA");
		Matcher match=pattern.matcher("JAVA JRE JVM JDK JAVA");
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
	
	private static void positionofmatches()
	{
		Pattern pattern=Pattern.compile("JAVA");
		Matcher match=pattern.matcher("JAVA JRE JVM JDK JAVA JAVA");
		while(match.find())
		{
			System.out.println(match.group()+" Start pos: "+match.start()+" End pos: "+match.end());
		}
	}
	
	private static void replaceDemo()
	{
		Pattern pattern=Pattern.compile("JAVA");
		Matcher match=pattern.matcher("JAVA JDK JRE JVM JAVA");
		String str=match.replaceAll("PYTHON");
		System.out.println(str);
	}
	
	private static void splitDemo()
	{
		Pattern pattern=Pattern.compile(",");
		String s[]=pattern.split("APPLE , PINEAPPLE , ORANGE");
		for(String kk:s)
		{
			System.out.print(kk);
		}
	}
}
