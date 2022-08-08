package com.sgtesting.threadenvironment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionDemo2 {

	public static void main(String[] args) {
		
		//regexp1();
		//regexp2();
		regexp3();

	}
	private static void regexp1()
	{
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		String str="Banglore has recieved 125 mm of rain";
		Matcher match=pattern.matcher(str);
		boolean val=match.find();
		System.out.println(val);
		String result=match.replaceFirst("Many");
		System.out.println(result);
	}
	
	private static void regexp2()
	{
		Pattern pattern=Pattern.compile("[0-9][3]");
		String str="Bangalore has recieved 125 mm rain yesterday";
		Matcher match=pattern.matcher(str);
		boolean val=match.find();
		System.out.println(val);
		String result=match.replaceFirst("many");
		System.out.println(result);
	}
	
	private static void regexp3()
	{
		Pattern pattern=Pattern.compile("[A-Z a-z]");
		String str="Banglore has recieved 125 mm of rain yesterday";
		Matcher match=pattern.matcher(str);
		while(match.find())
		{
			System.out.println(match.group());
		}
	}

}
