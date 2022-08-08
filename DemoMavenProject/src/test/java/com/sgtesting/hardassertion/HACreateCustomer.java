package com.sgtesting.hardassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.testsdemo.ActiTimePage;

public class HACreateCustomer {

	private static WebDriver oBrowser=null;
	private static ActiTimePage opage=null;

	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActiTimePage(oBrowser);
			System.out.println("Launch Browser done successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
			System.out.println("Navigate done successfully");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=3)
	private static void login()
	{
		try
		{
			opage.getUsername().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPwd().sendKeys("manager");
			Thread.sleep(2000);
			opage.getoLogin().click();
			Thread.sleep(4000);
			System.out.println("login done successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	private static void flyoutwindow()
	{
		try
		{
			opage.getGettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
			System.out.println("Flyout done successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void createcustomer()
	{
		try
		{
			opage.getTaskbutton().click();
			Thread.sleep(2000);
			opage.getAddNewButton().click();
			Thread.sleep(2000);
			opage.getNewcustomer().click();
			Thread.sleep(2000);
			opage.getCustomerLightBox_nameField().sendKeys("Customer");
			Thread.sleep(2000);
			opage.getCustomerLightBox_commitBtn().click();
			Thread.sleep(2000);
			System.out.println("Create Customer done successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void deletecustomer()
	{
		try
		{
			opage.getSettingbutton().click();
			Thread.sleep(2000);
			opage.getActionsButton().click();
			Thread.sleep(2000);
			opage.getDeletebutton().click();
			Thread.sleep(2000);
			opage.getCustomerPanel_deleteConfirm_submitBtn().click();
			Thread.sleep(2000);
			System.out.println("Delete Customer done successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void logout()
	{
		try
		{
			String excepted="Please identify yourself";
			opage.getLogoutLink().click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\"headerContainer\"]"));
			Assert.assertEquals(excepted, oEle.getText());
			System.out.println("Logout done successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
}
