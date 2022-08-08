package com.sgtesting.testsdemo;

import org.openqa.selenium.Alert;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateuserScenario {

	public static WebDriver oBrowser=null;
	
	@Test(priority= 1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 2)
	private static void navigate()
	{
		String expected, actual;
		try
		{
			expected="actiTIME - Login";
			Thread.sleep(2000);
			oBrowser.get("http://localhost/login.do");
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 3)
	private static void login()
	{
		try
		{
			String expected="actiTIME - Enter Time-Track";
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			Assert.assertEquals(expected,oBrowser.getTitle());
			System.out.println("Login executed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 4)
	private static void minimizeflyoutwindow()
	{
		try
		{
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsMenuWrapper\"]/div[1]/div[1]/div[2]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("FlyOut executed successfully");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 5)
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo6");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User6");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("Userdemo6@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser6");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome12345678");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome12345678");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(w.isDisplayed());
			System.out.println("Create user successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 6,enabled=false)
	private static void deleteuser()
	{
		try
		{
			String expected="User List";
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertEquals(expected, w.getText());
			System.out.println("Delete user successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 7,enabled=false)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			WebElement wele=oBrowser.findElement(By.xpath("\"//*[@id=\\\"headerContainer\\\"]\""));
			Assert.assertTrue(wele.isDisplayed());
			System.out.println("Logout seccessfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 8,enabled=false)
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
