package com.sgtesting.xpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		followingSibling();
		following();
		precedingsibling();
		preceding();
		ancestor();
		decendent();
	}
	
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\AutomationProtoTypeModel\\Library\\Drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///D:/XPath/WebTableHTML.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void followingSibling()
	{
		try
		{
			Thread.sleep(3000);
			//oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void following()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("50000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void precedingsibling()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void preceding()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void ancestor()
	{
		try
		{
			Thread.sleep(3000);
			WebElement wele=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::tr/ancestor::table"));
			String content=wele.getAttribute("id");
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void decendent()
	{
		try
		{
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("50000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
