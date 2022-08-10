package com.sgtesting.actitime.stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Given("^I launch the chrome browser$")
	public void I_launch_the_chrome_browser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I navigate the Application url$")
	public void i_navigate_the_Application_url()  
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the username in username text field$")
	public void i_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the password in password text field$")
	public void i_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on login button$")
	public void i_click_on_login_button() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the home page$")
	public void i_find_the_home_page()
	{
		WebElement oEle=null;
		try
		{
			oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on minimize flyout window$")
	public void i_click_on_minimize_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	@And("^I click on User$")
	public void I_click_on_User()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on Add user$")
	public void I_click_on_Add_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the firstName$")
	public void I_enter_the_firstName()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the LastName$")
	public void I_enter_the_LastName()
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the Email$")
	public void I_enter_the_Email()
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys("Userdemo1@gmail.com");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the Username$")
	public void I_enter_the_Username()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the password$")
	public void I_enter_the_password()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the passwordcopy$")
	public void I_enter_the_passwordcopy()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on create User$")
	public void I_click_on_create_User()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on User list$")
	public void I_click_on_User_list()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on Delete user$")
	public void I_click_on_Delete_user()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I handle the Alert$")
	public void I_handle_the_Alert()
	{
		try
		{
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I click on logout link$")
	public void i_click_on_logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the login page$")
	public void i_find_the_login_page() 
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I close Application$")
	public void I_close_Application() 
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
}
