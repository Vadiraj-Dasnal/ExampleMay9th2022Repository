package com.sgtesting.tests;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTask {

	public static WebDriver oBrowser=null;

	@Test(priority= 1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLE\\ExampleAutomation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
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
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			System.out.println("Navigate successfull");
			oBrowser.manage().window().maximize();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"enterTTMainContent\"]/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("Login successfull");
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
			System.out.println("Minimize fly out window successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 5)
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Real time customer");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("Create customer successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 6)
	private static void createproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[	@id=\'projectPopup_commitBtn\']")).click();
			Thread.sleep(2000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("Create project successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 7)
	private static void createtask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("Task2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]")).click();
			Thread.sleep(3000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("Create task is successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 8)
	private static void deletetask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
			Thread.sleep(3000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("Delete task is successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 9)
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
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("delete project successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 10)
	private static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(3000);
			WebElement web=oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[1]"));
			Assert.assertTrue(web.isDisplayed());
			System.out.println("Delete customer successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 11)
	private static void logout()
	{
		try
		{
			String expected="Please identify yourself";
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			WebElement wele=oBrowser.findElement(By.xpath("\"//*[@id=\\\"headerContainer\\\"]\""));
			Assert.assertEquals(expected, wele.getText());
			System.out.println("Logout successfull");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority= 12)
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
