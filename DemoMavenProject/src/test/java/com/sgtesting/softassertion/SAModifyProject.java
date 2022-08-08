package com.sgtesting.softassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sgtesting.testsdemo.ActiTimePage;

public class SAModifyProject {

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
			SoftAssert soft=new SoftAssert();
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"headerContainer\"]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Navigate successfull");
			soft.assertAll();
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
			SoftAssert soft=new SoftAssert();
			opage.getUsername().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPwd().sendKeys("manager");
			Thread.sleep(2000);
			opage.getoLogin().click();
			Thread.sleep(4000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"enterTTMainContent\"]/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Login successfull");
			soft.assertAll();
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
			SoftAssert soft=new SoftAssert();
			opage.getTaskbutton().click();
			Thread.sleep(2000);
			opage.getAddNewButton().click();
			Thread.sleep(2000);
			opage.getNewcustomer().click();
			Thread.sleep(2000);
			opage.getCustomerLightBox_nameField().sendKeys("Customer1");
			Thread.sleep(2000);
			opage.getCustomerLightBox_commitBtn().click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Create customer successfull");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void createproject()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			opage.getAddNewButton().click();
			Thread.sleep(2000);
			opage.getNewproject().click();
			Thread.sleep(2000);
			opage.getEnterProjectName().sendKeys("Project");
			Thread.sleep(2000);
			opage.getProjectPopup_commitBtn().click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Create project successfull");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void modifyproject()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			opage.getProjectSettingBtn().click();
			Thread.sleep(2000);
			opage.getModifyProjectDesc().sendKeys("Project Description");
			Thread.sleep(2000);
			opage.getProjectSettingBtn().click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("modify project successfull");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	private static void deleteproject()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			opage.getProjectSettingBtn().click();
			Thread.sleep(2000);
			opage.getProjectActionBtn().click();
			Thread.sleep(2000);
			opage.getProjectDeleteBtn().click();
			Thread.sleep(2000);
			opage.getProjectPermentDelete().click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("delete project successfull");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
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
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("delete customer successfull");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
	private static void logout()
	{
		try
		{
			SoftAssert soft=new SoftAssert();
			opage.getLogoutLink().click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.id("username"));
			soft.assertTrue(web.isDisplayed());
			System.out.println("Logout successfull");
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=11)
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
