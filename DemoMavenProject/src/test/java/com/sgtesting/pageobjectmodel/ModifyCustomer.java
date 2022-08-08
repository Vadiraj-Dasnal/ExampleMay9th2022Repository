package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sgtesting.testsdemo.ActiTimePage;

public class ModifyCustomer {

	public static WebDriver oBrowser=null;
	public static ActiTimePage opage=null;
	
	@Test(priority=1)
	public static void openbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\DemoMavenProject\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActiTimePage(oBrowser);
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void modifycustomer()
	{
		try
		{
			opage.getSettingbutton().click();
			Thread.sleep(2000);
			opage.getModifyCustDescription().sendKeys("Customer modified");
			Thread.sleep(2000);
			opage.getSettingbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
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
			opage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	private static void exit()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
