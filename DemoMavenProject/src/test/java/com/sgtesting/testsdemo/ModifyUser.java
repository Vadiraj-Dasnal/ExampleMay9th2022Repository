package com.sgtesting.testsdemo;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyUser {
	public static WebDriver oBrowser=null;

	@Test(priority= 1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			System.out.println("Launch Browser successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority= 2)
	private static void navigate()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"logoContainer\"]/div[2]/div/img"));
			Assert.assertTrue(w.isDisplayed());
			System.out.println("Navigattion successfull");
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
			Assert.assertEquals(expected, oBrowser.getTitle());
			System.out.println("Login executed successfully");
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
			System.out.println("Minimize fly out window successfull");
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
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("Userdemo1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertNotNull(w);
			System.out.println("Create user is successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority= 6)
	private static void modify()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertNotNull(w);
			System.out.println("Modify user successfull");
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
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertNotNull(w);
			System.out.println("Delete user successfull");
			
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
			WebElement wele=oBrowser.findElement(By.xpath("//*[@id=\"headerContainer\"]"));
			Assert.assertTrue(wele.isDisplayed());
			Thread.sleep(2000);
			System.out.println("Logout successfull");
			Thread.sleep(2000);
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
