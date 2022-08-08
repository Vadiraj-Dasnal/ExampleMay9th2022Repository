package com.sgtesting.parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.testsdemo.ActiTimePage;

public class PModifyCustomer {

	public static WebDriver oBrowser=null;
	public static ActiTimePage opage=null;
	
	@DataProvider
	public Object[][] getcredentials()
	{
		return new Object[][] {{"webdriver.chrome.driver","C:\\EXAMPLE\\ExampleAutomation\\DemoMavenProject\\Library\\Drivers\\chromedriver.exe"}};
	}
	@Test(priority=1, dataProvider="getcredentials")
	public static void openbrowser(String key, String value)
	{
		try
		{
			System.setProperty(key, value);
			oBrowser=new ChromeDriver();
			opage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@DataProvider
	public Object[][] getCredentialss11()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	@Test(priority=2, dataProvider="getCredentialss11")
	private static void navigate(String url)
	{
		try
		{
			oBrowser.navigate().to(url);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getCredentials1()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(priority=3, dataProvider="getCredentials1")
	private static void login(String username, String pwd)
	{
		try
		{
			opage.getUsername().sendKeys(username);
			Thread.sleep(2000);
			opage.getPwd().sendKeys(pwd);
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
	public Object[][] getCredentials11()
	{
		return new Object[][] {{"Customer1"}};
	}
	@Test(priority=5, dataProvider="getCredentials11")
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
	
	@DataProvider
	public Object[][] getCredentials111()
	{
		return new Object[][] {{"Customer modified"}};
	}
	@Test(priority=6, dataProvider="getCredentials111")
	private static void modifycustomer(String description)
	{
		try
		{
			opage.getSettingbutton().click();
			Thread.sleep(2000);
			opage.getModifyCustDescription().sendKeys(description);
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
