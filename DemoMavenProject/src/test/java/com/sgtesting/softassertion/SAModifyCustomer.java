package com.sgtesting.softassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sgtesting.testsdemo.ActiTimePage;

public class SAModifyCustomer {

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
		String expected, actual;
		try
		{
			SoftAssert sa=new SoftAssert();
			expected="actiTIME - Login";
			oBrowser.navigate().to("http://localhost/login.do");
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			System.out.println("Navigate successfull");
			sa.assertAll();
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
			SoftAssert obj=new SoftAssert();
			opage.getUsername().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPwd().sendKeys("manager");
			Thread.sleep(2000);
			opage.getoLogin().click();
			Thread.sleep(4000);
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"enterTTMainContent\"]/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"));
			obj.assertTrue(w.isDisplayed());
			System.out.println("Login successfull");
			obj.assertAll();
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
			SoftAssert obj=new SoftAssert();
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
			WebElement w=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			obj.assertTrue(w.isDisplayed());
			System.out.println("Create customer successfull");
			obj.assertAll();
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
			SoftAssert obj=new SoftAssert();
			opage.getSettingbutton().click();
			Thread.sleep(2000);
			opage.getModifyCustDescription().sendKeys("Customer modified");
			Thread.sleep(2000);
			opage.getSettingbutton().click();
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
	
	@Test(priority=7)
	private static void deletecustomer()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			opage.getSettingbutton().click();
			Thread.sleep(2000);
			opage.getActionsButton().click();
			Thread.sleep(2000);
			opage.getDeletebutton().click();
			Thread.sleep(2000);
			opage.getCustomerPanel_deleteConfirm_submitBtn().click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Delete Customer successfull");
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
			SoftAssert soft=new SoftAssert();
			opage.getLogoutLink().click();
			Thread.sleep(2000);
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
