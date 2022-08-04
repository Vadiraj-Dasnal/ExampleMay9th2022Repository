package com.sgtesting.tests;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ModifyCustomer {
	public static WebDriver oBrowser=null;
	
	@Test(priority= 1)
	private static void openbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
			System.out.println("Open Browser successfull");
			
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
			SoftAssert sa=new SoftAssert();
			expected="actiTIME - Login";
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			System.out.println("Navigate successfull");
			sa.assertAll();
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
			SoftAssert obj=new SoftAssert();
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"enterTTMainContent\"]/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"));
			obj.assertTrue(w.isDisplayed());
			System.out.println("Login successfull");
			obj.assertAll();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			System.out.println("Minimize flyout window successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 5)
	private static void createtask()
	{
		try
		{
			SoftAssert obj=new SoftAssert();
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(1000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			obj.assertTrue(w.isDisplayed());
			System.out.println("Create customer successfull");
			obj.assertAll();
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
			SoftAssert obj=new SoftAssert();
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("part time customer");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/div[2]/p[1]"));
			obj.assertTrue(web.isDisplayed());
			System.out.println("Modify customer");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 7)
	private static void delete()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(1000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Delete Customer successfull");
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
			SoftAssert soft=new SoftAssert();
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"licenseLink\"]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Logout successfull");
			Thread.sleep(2000);
			soft.assertAll();
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
