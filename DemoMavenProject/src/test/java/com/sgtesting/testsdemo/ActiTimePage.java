package com.sgtesting.testsdemo;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for login page Username text field
	private WebElement username;


	//WebElement for login page password text field
	private WebElement pwd;

	//WebElement for login page login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;

	//WebElement for login page flyout window field
	private WebElement gettingStartedShortcutsPanelId;

	//WebElement for logout button field
	private WebElement logoutLink;

	//WebElement for user field
	@FindBy(xpath="//a[@class='content users']")
	private WebElement userfield; 

	//WebElement for add user field 
	@FindBy(xpath="//div[@class='addUserButton beigeButton useNativeActive']")
	private WebElement adduser;

	
	//WebElement for first name
	private WebElement firstName;

	//WebElement for last name
	private WebElement lastName;

	//WebElement for email
	private WebElement email;

	//WebElement for username field
	private WebElement userDataLightBox_usernameField;

	//WebElement for password field
	private WebElement userDataLightBox_passwordField;

	//WebElement for passwordcopy
	private WebElement passwordCopy;

	//WebElement for Create User button
	private WebElement userDataLightBox_commitBtn;

	//WebElement for click on user table
	@FindBy(xpath="//td[@class='userNameCell first']")
	private WebElement userinfo;

	//WebElement for Delete user info
	private WebElement userDataLightBox_deleteBtn;

	//User create and Modify completed	

	//WebElement for task button
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskbutton;

	//WebElement for Add New
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement AddNewButton;

	//WebElement for Add New Customer
	@FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
	private WebElement newcustomer;

	//WebElement for Customer name
	private WebElement customerLightBox_nameField;

	//WebElement for Customer create button
	private WebElement customerLightBox_commitBtn;

	//WebElement for click on setting button
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement settingbutton;

	//WebElement for Customer modify description
	@FindBy(xpath = "//textarea[@class='textarea']")
	private WebElement modifyCustDescription;

	//WebElement for action button
	@FindBy(xpath = "//div[@class='actionButton']")
	private WebElement actionsButton;

	//WebElement for action button Delete
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement deletebutton;
	
	//WebElement for customer delete permently
	private WebElement customerPanel_deleteConfirm_submitBtn;
	
	//WebElement for Add New Project
	@FindBy(xpath = "//div[@class='item createNewProject ellipsis']")
	private WebElement newproject;

	//WebElement for Enter Project Name
	@FindBy(xpath = "//*[@id=\"projectPopup_projectNameField\"]")
	private WebElement enterProjectName;

	
	//WebElement for Enter Project Description
	private WebElement projectDescriptionField;

	//WebElement for click on Create project
	private WebElement projectPopup_commitBtn;
	
	//WebElement for click on project setting button
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectSettingBtn;

	//WebElement for project action button
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement projectActionBtn;
	
	//WebElement for project Delete button
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement projectDeleteBtn;
	
	//WebElement for project permanent delete button
	@FindBy(xpath = "//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement projectPermentDelete;

	//WebElement for project modify project desc
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyProjectDesc;

	//==============================================================
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getoLogin() {
		return oLogin;
	}

	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getUserfield() {
		return userfield;
	}

	public WebElement getAdduser() {
		return adduser;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getUserDataLightBox_usernameField() {
		return userDataLightBox_usernameField;
	}

	public WebElement getUserDataLightBox_passwordField() {
		return userDataLightBox_passwordField;
	}

	public WebElement getPasswordCopy() {
		return passwordCopy;
	}

	public WebElement getUserDataLightBox_commitBtn() {
		return userDataLightBox_commitBtn;
	}

	public WebElement getUserinfo() {
		return userinfo;
	}

	public WebElement getUserDataLightBox_deleteBtn() {
		return userDataLightBox_deleteBtn;
	}

	public WebElement getTaskbutton() {
		return taskbutton;
	}

	public WebElement getAddNewButton() {
		return AddNewButton;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustomerLightBox_nameField() {
		return customerLightBox_nameField;
	}

	public WebElement getCustomerLightBox_commitBtn() {
		return customerLightBox_commitBtn;
	}

	public WebElement getSettingbutton() {
		return settingbutton;
	}

	public WebElement getModifyCustDescription() {
		return modifyCustDescription;
	}

	public WebElement getActionsButton() {
		return actionsButton;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}
	
	public WebElement getCustomerPanel_deleteConfirm_submitBtn() {
		return customerPanel_deleteConfirm_submitBtn;
	}

	public WebElement getNewproject() {
		return newproject;
	}
	
	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getProjectDescriptionField() {
		return projectDescriptionField;
	}

	public WebElement getProjectPopup_commitBtn() {
		return projectPopup_commitBtn;
	}
	
	public WebElement getProjectSettingBtn() {
		return projectSettingBtn;
	}
	public WebElement getProjectActionBtn() {
		return projectActionBtn;
	}

	public WebElement getProjectDeleteBtn() {
		return projectDeleteBtn;
	}

	public WebElement getProjectPermentDelete() {
		return projectPermentDelete;
	}
	
	public WebElement getModifyProjectDesc() {
		return modifyProjectDesc;
	}
}
