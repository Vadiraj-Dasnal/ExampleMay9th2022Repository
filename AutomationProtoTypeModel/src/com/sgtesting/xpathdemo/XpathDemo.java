package com.sgtesting.xpathdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		absoluteXpathDemo();
		relativeXpathUsingTagNameAlone();
		relativeXpathUsingTagNameWithIndex();
		relativeXpathUsingTagNameWithAttributeNameValue();
		relativeXpathUsingAttributeNameValue();
		relativeXpathUsingAttributeValue();
		relativeXpathUsingTagNameWithMultipleAttributeNameValue();
		relativeXpathUsingTagNameWithMultipleAttributeNamevalueUsingAndOperator();
		relativeXpathUsingTagNameWithMultipleAttributeNamevalueUsingOrOperator();
		relativeXpathUsingPartialAttributeValue();
		relativeXpathUsingTagNameWithAttributeName();
		relativeXpathUsingTagNameWithAttributeName_1();
		relativeXpathUsingTagNameWithAttributeName_2();
		relativeXpathUsingTagNameWithAttributeName_3();
		relativeXpathUsingTagNameWithTextContent();
		relativeXpathUsingTagNameWithPartialTextContent();
	}
	
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\AutomationProtoTypeModel\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("D:\\XPath\\Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXpathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	
	/**
	 * case 1: Identify the element based on tag name alone
	 * syntax: //<tagname>
	 * here it takes th first input term which is displayed
	 */
	private static void relativeXpathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	
	/**
	 * case 2: Identify the element based on tag name with index
	 * syntax: //<tagName>[index]
	 */
	private static void relativeXpathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
	}
	
	
	/**
	 * case 3: Identify the Element based on tag name with
	 * attributeName and value combination
	 * syntax: //<tagName>[@attributename='attributevalue']
	 */
	private static void relativeXpathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser1");
		
	}
	
	/**
	 * case 4: Identify the Element based on Attribute name and value combination
	 * syntax: //*[@attributename='attributevalue']
	 */
	private static void relativeXpathUsingAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	
	/**
	 *  case 5: Identify the Element based on
	 *  attributename and value alone
	 *  syntax: //*[@*='attributevalue']
	 */
	private static void relativeXpathUsingAttributeValue()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	
	/**
	 * case 6: Identify the Element Tagname with 
	 * Multiple attributename and value combination using and operator
	 * Syntax: //<tagName>[@attributename='attributevalue'] [@attributename='attributevale']
	 */
	private static void relativeXpathUsingTagNameWithMultipleAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@name='submit1btn1']")).click();
	}
	
	/**
	 * Case 7: Identify the Element Tagname with 
	 * Multiple attributename and value combination using and operator 
	 * Syntax: //<tagName>[@attributename='attributevalue' and @attributename='attributevale']
	 */
	private static void relativeXpathUsingTagNameWithMultipleAttributeNamevalueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @name='submit1btn1']")).click();
	}
	
	/**
	 * Case 8: Identify the Element Tagname with 
	 * Multiple attributename and value combination using or operator
	 * syntax: //<tagName.[@attributename='attributevalue' or @attributename='attribytevalue']
	 */
	private static void relativeXpathUsingTagNameWithMultipleAttributeNamevalueUsingOrOperator()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' or @name='submit1btn1']")).click();
	}
	
	/**
	 * Case 9: Identify the Element based on TagName with attributename
	 * and partial attribute value combination
	 * syntax:
	 * 		starts-with(@attributename,'partialattributevalue')
	 * 		ends-with(@attributename,'partialattributevalue')
	 * 		contains(@attributename,'partialattributevalue')
	 * //<tagName>[starts-with(@attributename,'partialattributevalue')]
	 * //<tagName>[ends-with(@attributename,'partialattributevalue')]
	 * //<tagName>[contains(@attributename,'partialattributevalue')]
	 */
	private static void relativeXpathUsingPartialAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit1)]")).click();
	}
	
	/**
	 *  Case 10: Identify the element based on TagName with attributename
	 *  syntax: //<tagName>[@attributename]
	 */
	private static void relativeXpathUsingTagNameWithAttributeName()
	{
		//find out numbers of links in a web page
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of links are: "+olinks.size());
	}
	
	private static void relativeXpathUsingTagNameWithAttributeName_1()
	{
		//display all available link names
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0; i<oLinks.size(); i++)
		{
			WebElement link=oLinks.get(i);
			System.out.println(link.getText());
		}
	}
	
	private static void relativeXpathUsingTagNameWithAttributeName_2()
	{
		//identify the link based on Link text ends with
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0; i<olinks.size(); i++)
			{
				WebElement link=olinks.get(i);
				if(link.getText().endsWith("Testing"))
				{
					link.click();
					Thread.sleep(4000);
					break;
				}
			}
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void relativeXpathUsingTagNameWithAttributeName_3()
	{
		//org.openqa.selenium.staleElementReferenceExcpetion: stale element refernce:
		// element is not attached to the page document
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			Thread.sleep(5000);
			for(int i=0; i<olinks.size(); i++)
			{
				WebElement link=olinks.get(i);
				if(link.getText().endsWith("Testing"))
				{
					link.click();
					Thread.sleep(4000);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * case 11: Identify the element with TagName with
	 * 		    Text content
	 * 	syntax: //<tagName>[text()='Text Content']
	 */
	private static void relativeXpathUsingTagNameWithTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
	}
	
	/**
	 * case 12: Identify the element based on TagName with partial Text content
	 * Syntax: 
	 * starts-with(text(),'partial Text Content')
	 * contains(text(),'partial Text Content')
	 * ends-with(text(),'partial Text Content')
	 * //<tagName>[starts-with(text(),'partial Text Content')]
	 * //<tagName>[contains(text(),'partial Text Content')]
	 * //<tagName>[ ends-with(text(),'partial Text Content')]
	 */
	private static void relativeXpathUsingTagNameWithPartialTextContent()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'eniu')]")).click();
	}
}
