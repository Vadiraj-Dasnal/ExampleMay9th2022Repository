package com.sgtesting.parameterized;

import org.openqa.selenium.Alert;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModifyUser {
	public static WebDriver oBrowser=null;

	@DataProvider
	public Object[][] getcredentials()
	{
		return new Object[][] {{"webdriver.chrome.driver","C:\\EXAMPLE\\ExampleAutomation\\AutomationProtoTypeModel\\Library\\Drivers\\chromedriver.exe"}};
	}
	@Test(priority= 1, dataProvider="getcredentials")
	private static void openbrowser(String key, String value)
	{
		try
		{
			System.setProperty(key, value);
			oBrowser=new ChromeDriver();
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
	@Test(priority= 2, dataProvider="getCredentialss11")
	private static void navigate(String url)
	{
		try
		{
			oBrowser.get(url);
			Thread.sleep(3000);
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
	@Test(priority= 3, dataProvider="getCredentials1")
	private static void login(String username, String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(username);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority= 4)
	private static void minimize()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
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
	@Test(priority= 5, dataProvider="getCredentials")
	private static void createuser(String user, String welc, String email, String username, String password)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys(welc);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys(email);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(password);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getCredentials11()
	{
		return new Object[][] {{"Welcome123"}};
	}
	@Test(priority= 6, dataProvider="getCredentials11")
	private static void modify(String passw)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(passw);
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(passw);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority= 7)
	private static void deleteuser()
	{
		try
		{
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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

	@Test(priority= 8)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority= 9)
	private static void exit()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
