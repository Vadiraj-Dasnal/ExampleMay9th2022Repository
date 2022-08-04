package com.sgtesting.parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModifyProject {

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
			Thread.sleep(3000);
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getCredentials11()
	{
		return new Object[][] {{"Customer1", "Real time customer"}};
	}
	@Test(priority= 5, dataProvider="getCredentials11")
	private static void createCustomer(String cust, String description)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(cust);
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(description);
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getCredentials111()
	{
		return new Object[][] {{"Project1"}};
	}
	@Test(priority= 6, dataProvider="getCredentials111")
	private static void createproject(String project)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(project);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[	@id=\'projectPopup_commitBtn\']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getCredentials1111()
	{
		return new Object[][] {{"Java Project"}};
	}
	@Test(priority= 7, dataProvider="getCredentials1111")
	private static void modifyproject(String project)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys(project);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 8)
	private static void deleteproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 9)
	private static void delete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority= 10)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 11)
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
