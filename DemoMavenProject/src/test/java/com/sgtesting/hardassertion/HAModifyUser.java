package com.sgtesting.hardassertion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.testsdemo.ActiTimePage;

public class HAModifyUser {

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
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"logoContainer\"]/div[2]/div/img"));
			Assert.assertTrue(w.isDisplayed());
			System.out.println("Navigattion successfull");
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
			String expected="actiTIME - Enter Time-Track";
			opage.getUsername().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPwd().sendKeys("manager");
			Thread.sleep(2000);
			opage.getoLogin().click();
			Thread.sleep(4000);
			Assert.assertEquals(expected, oBrowser.getTitle());
			System.out.println("Login executed successfully");
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
			System.out.println("Minimize fly out window successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void createuser()
	{
		try
		{
			opage.getUserfield().click();
			opage.getAdduser().click();
			opage.getFirstName().sendKeys("UserName2");
			opage.getLastName().sendKeys("DemoUser2");
			opage.getEmail().sendKeys("UserName@gmail.com");
			opage.getUserDataLightBox_usernameField().sendKeys("DemoUser345");
			opage.getUserDataLightBox_passwordField().sendKeys("123456");
			opage.getPasswordCopy().sendKeys("123456");
			Thread.sleep(2000);
			opage.getUserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertNotNull(w);
			System.out.println("Create user is successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void modifyuser()
	{
		try
		{
			opage.getUserinfo().click();
			Thread.sleep(2000);
			opage.getUserDataLightBox_passwordField().sendKeys("948077");
			Thread.sleep(1000);
			opage.getPasswordCopy().sendKeys("948077");
			Thread.sleep(2000);
			opage.getUserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertNotNull(w);
			System.out.println("Modify user successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
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
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[1]/div/span"));
			Assert.assertNotNull(w);
			System.out.println("Delete user successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
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
	
	@Test(priority=9)
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
