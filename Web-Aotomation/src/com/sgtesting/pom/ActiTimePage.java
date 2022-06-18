package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser) 
	{
		PageFactory.initElements(oBrowser, this);

	}

	//Username field
	private WebElement username;
	public WebElement getuserName()
	{
		return username;
	}

	//Password Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//login Button Field
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//minimizeFlyOutWindow

	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getMinimizeFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//LogOut
	@FindBy(linkText ="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}


	//UserCreation S1
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement ClickOnUSer;
	public WebElement getClickOnUser()
	{
		return ClickOnUSer;
	}

	//UserCreation S2
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement ClickOnAddUSer;
	public WebElement getClickOnAddUser()
	{
		return ClickOnAddUSer;
	}

	//UserCreation S3
	private WebElement firstName;
	public WebElement getClickOnFirstNAme()
	{
		return firstName;
	}

	//UserCreation S4

	private WebElement lastName;
	public WebElement getClickOnLastNAme()
	{
		return lastName;

	}

	//UserCreation S5

	private WebElement email;
	public WebElement getClickOnEmail()
	{
		return email;

	}

	//UserCreation S6

	private WebElement userDataLightBox_usernameField;
	public WebElement getClickOnUserDetails()
	{
		return userDataLightBox_usernameField;

	}

	//UserCreation S7

	private WebElement password;
	public WebElement getClickOnPassword()
	{
		return password;

	}

	//UserCreation S8

	private WebElement passwordCopy;
	public WebElement getClickOnRetypePassword()
	{
		return passwordCopy;

	}

	//UserCreation S9
	@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement ClickOnSaveUser;
	public WebElement getClickOnSaveUser()
	{
		return ClickOnSaveUser;

	}

	//Delete User s1
	@FindBy(xpath = "//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement ClickOnUserCreated;
	public WebElement getClickOnUserCreated()
	{
		return ClickOnUserCreated;

	}

	//Delete User s2
	@FindBy(xpath = "//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement ClickOnDelete;
	public WebElement getClickOnDelete()
	{
		return ClickOnDelete;

	}


	// modify user
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement ClickOnSaveChanges;
	public WebElement getClickOnSaveChanges()
	{
		return ClickOnSaveChanges;
	}


	//Create Customer S1
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement ClickOnTask;
	public WebElement getClickOnTaskToCreateProject()
	{
		return ClickOnTask;
	}


	//Create Customer S2
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement ClickOnAdd;
	public WebElement getClickOnAdd()
	{
		return ClickOnAdd;
	}


	//Create Customer S3
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement ClickOnNewCustomer;
	public WebElement getClickOnNewCustomer()
	{
		return ClickOnNewCustomer;
	}


	//Create Customer S4

	private WebElement customerLightBox_nameField;
	public WebElement getClickOnCustomerName()
	{
		return customerLightBox_nameField;
	}

	//Create Customer S5
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement ClickOnSaveCustomer;
	public WebElement getClickOnSaveCustomer()
	{
		return ClickOnSaveCustomer;
	}

	// delete customer s1
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement ClickOnEditCustomer;
	public WebElement getClickOnEditCustomer()
	{
		return ClickOnEditCustomer;
	}

	// delete customer s2
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement ClickOnActionCustomer;
	public WebElement getClickOnActionCustomer()
	{
		return ClickOnActionCustomer;
	}

	// delete customer s3
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement ClickOnDeleteCustomer;
	public WebElement getClickOnDeleteCustomer()
	{
		return ClickOnDeleteCustomer;
	}

	// delete customer s4
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement ClickOnDeletePermanantlyCustomer;
	public WebElement getClickOnDeletePermanantlyCustomer()
	{
		return ClickOnDeletePermanantlyCustomer;
	}

	//Modify Customer S1
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement ClickOnCustomerName;
	public WebElement getClickOnCustomerNameToEdit()
	{
		return ClickOnCustomerName;
	}

	//Modify Customer S2
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement ClickOnBlankspace;
	public WebElement getClickOnBlankSpace()
	{
		return ClickOnBlankspace;
	}

	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]")
	private WebElement ClickOnCustomerFile;
	public WebElement getClickOnCustomerFile()
	{
		return ClickOnCustomerFile;
	}

	//Create Project S1
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement ClickOnAddNewProject;
	public WebElement getClickOnAddNewProject()
	{
		return ClickOnAddNewProject;
	}

	//Create Project S2

	private WebElement projectPopup_projectNameField;
	public WebElement getClickOnProjectName()
	{
		return projectPopup_projectNameField;
	}

	//Create Project S3
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement ClickOnSaveProject;
	public WebElement getClickOnSaveProject()
	{
		return ClickOnSaveProject;
	}

	//Delete Project S1
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement ClickOnEditProject;
	public WebElement getClickOnEditProject()
	{
		return ClickOnEditProject;
	}

	//Delete Project S2
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement ClickOnProjectAction;
	public WebElement getClickOnProjectAction()
	{
		return ClickOnProjectAction;
	}

	//Delete Project S3
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement ClickOnProjectDelete;
	public WebElement getClickOnProjectDelete()
	{
		return ClickOnProjectDelete;
	}

	//Delete Project S4

	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnProjectDeletePermanantly()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}

	//Modify Project S1
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement ClickOnProjectNameToEdit;
	public WebElement getClickOnProjectNameToEdit()
	{
		return ClickOnProjectNameToEdit;
	}


	//Modify Project S2
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement ClickOnProjectName;
	public WebElement getClickOnProjectNameBlankSpace()
	{
		return ClickOnProjectName;
	}



	//Modify Project S3
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[1]")
	private WebElement ClickOnProjectIcon;
	public WebElement getClickOnProjectIcon()
	{
		return ClickOnProjectIcon;
	}


	//Create Tasks  S1
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement ClickOnAddNewTask;
	public WebElement getClickOnAddNewTask()
	{
		return ClickOnAddNewTask;
	}

	//Create Tasks  S2
	@FindBy(xpath = "/html/body/div[13]/div[1]")
	private WebElement ClickOnCreateNewTask;
	public WebElement getClickOnCreateNewTask()
	{
		return ClickOnCreateNewTask;
	}

	//Create Tasks  S3
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement ClickOnTaskName;
	public WebElement getClickOnTaskName()
	{
		return ClickOnTaskName;
	}

	//Create Tasks  S4
	@FindBy(xpath = "//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement ClickOnCreateTask;
	public WebElement getClickOnCreateTask()
	{
		return ClickOnCreateTask;
	}

	//Delete Tasks S1
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement ClickOnTaskNameToEdit;
	public WebElement getClickOnTaskNameToEdit()
	{
		return ClickOnTaskNameToEdit;
	}

	//Delete Tasks S2
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement ClickOnTaskAction;
	public WebElement getClickOnTaskAction()
	{
		return ClickOnTaskAction;
	}

	//Delete Tasks S3
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement ClickOnTaskDelete;
	public WebElement getClickOnTaskDelete()
	{
		return ClickOnTaskDelete;
	}

	//Delete Tasks S4

	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnTaskDeletePermanantly()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}

}
