package com.sgtesting.parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.testsdemo.ActiTimePage;

public class PCreateCustomer {

	private static WebDriver oBrowser=null;
	private static ActiTimePage opage=null;

	@DataProvider
	public Object[][] getcredentials()
	{
		return new Object[][] {{"webdriver.chrome.driver","C:\\EXAMPLE\\ExampleAutomation\\AutomationProtoTypeModel\\Library\\Drivers\\chromedriver.exe"}};
	}
	@Test(priority=1, dataProvider="getcredentials")
	private static void launchBrowser(String key, String value)
	{
		try
		{
			System.setProperty(key,value);
			oBrowser=new ChromeDriver();
			opage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@DataProvider
	public Object[][] getCredentials11()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	@Test(priority=2, dataProvider="getCredentials11")
	private static void navigate(String url)
	{
		try
		{
			oBrowser.navigate().to(url);
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@DataProvider
	public Object[][] getCredentials()
	{
		return new Object[][] {{"admin", "manager"}};
	}
	@Test(priority=3, dataProvider="getCredentials")
	private static void login(String username, String passw)
	{
		try
		{
			opage.getUsername().sendKeys(username);
			Thread.sleep(2000);
			opage.getPwd().sendKeys(passw);
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
	
	@DataProvider
	public Object[][] getCredentials1()
	{
		return new Object[][] {{"Customer1"}};
	}
	@Test(priority=5, dataProvider="getCredentials1")
	private static void createcustomer(String cust1)
	{
		try
		{
			opage.getTaskbutton().click();
			Thread.sleep(2000);
			opage.getAddNewButton().click();
			Thread.sleep(2000);
			opage.getNewcustomer().click();
			Thread.sleep(2000);
			opage.getCustomerLightBox_nameField().sendKeys(cust1);
			Thread.sleep(2000);
			opage.getCustomerLightBox_commitBtn().click();
			Thread.sleep(2000);
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
	
	@Test(priority= 8)
	private static void exit()
	{
		try
		{
			oBrowser.quit();;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
