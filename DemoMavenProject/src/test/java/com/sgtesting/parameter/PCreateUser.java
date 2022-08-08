package com.sgtesting.parameter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.testsdemo.ActiTimePage;

public class PCreateUser 
{
	private static WebDriver oBrowser=null;
	private static ActiTimePage opage=null;

	@DataProvider
	public Object[][] getcredentials()
	{
		return new Object[][] {{"webdriver.chrome.driver","C:\\EXAMPLE\\ExampleAutomation\\DemoMavenProject\\Library\\Drivers\\chromedriver.exe"}};
	}
	@Test(priority=1, dataProvider="getcredentials")
	private static void launchBrowser(String key, String value)
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
	public Object[][] getCredentials11()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	@Test(priority=2, dataProvider="getCredentials11")
	private static void navigate(String url)
	{
		try
		{
			oBrowser.get(url);
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@DataProvider
	public Object[][] getCredentials1()
	{
		return new Object[][] {{"admin", "manager"}};
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
	public Object[][] getCredentials()
	{
		return new Object[][] {{"Demouser1","Welcome1","DemoUser1@gmail.com","DemoUser6","welcome12345678"}};
	}
	@Test(priority=5,dataProvider="getCredentials")
	private static void createuser(String user, String welc, String email, String username, String password)
	{
		try
		{
			opage.getUserfield().click();
			opage.getAdduser().click();
			opage.getFirstName().sendKeys(user);
			opage.getLastName().sendKeys(welc);
			opage.getEmail().sendKeys(email);
			opage.getUserDataLightBox_usernameField().sendKeys(username);
			opage.getUserDataLightBox_passwordField().sendKeys(password);
			opage.getPasswordCopy().sendKeys(password);
			Thread.sleep(2000);
			opage.getUserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void deleteuser()
	{
		try
		{
			opage.getUserinfo().click();
			Thread.sleep(2000);
			opage.getUserDataLightBox_deleteBtn().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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

