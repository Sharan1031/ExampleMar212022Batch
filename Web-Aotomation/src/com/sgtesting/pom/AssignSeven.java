package com.sgtesting.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignSeven{
public static WebDriver oBrowser = null;
public static ActiTimePage oPage = null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTasks();
		deleteTasks();
		deleteProject();
		deleteCustomer();
    	logout();
		closeApplication();
		
		
	}
	
	private static void launchBrowser()
	{
		try 
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\TestAutomation\\Automation\\ActiTimeTestngAutomation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage = new ActiTimePage(oBrowser);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{

		try
		{
			
			oPage.getuserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			oPage.getClickOnTaskToCreateProject().click();
			Thread.sleep(3000);
			oPage.getClickOnAdd().click();
			Thread.sleep(3000);
			oPage.getClickOnNewCustomer().click();
			Thread.sleep(3000);
			oPage.getClickOnCustomerName().sendKeys("Apple");
			Thread.sleep(3000);
			oPage.getClickOnSaveCustomer().click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	private static void createProject()
	{
		try
		{
			
			oPage.getClickOnAdd().click();
			Thread.sleep(3000);
			oPage.getClickOnAddNewProject().click();
			Thread.sleep(2000);
			oPage.getClickOnProjectName().sendKeys("Developing The Application");
			Thread.sleep(3000);
			oPage.getClickOnSaveProject().click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void createTasks()
	{
		try
		{
			
			oPage.getClickOnAddNewTask().click();
			Thread.sleep(3000);
			oPage.getClickOnCreateNewTask().click();
			Thread.sleep(3000);
			oPage.getClickOnTaskName().sendKeys("Complete The Creation Of Home Page Foe Music Application");
			Thread.sleep(3000);
			oPage.getClickOnCreateTask().click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void deleteTasks()
	{
		try
		{
			
			oPage.getClickOnTaskNameToEdit().click();
			Thread.sleep(3000);
			oPage.getClickOnTaskAction().click();
			Thread.sleep(3000);
			oPage.getClickOnTaskDelete().click();
			Thread.sleep(3000);
			oPage.getClickOnTaskDeletePermanantly().click();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			
			oPage.getClickOnEditProject().click();
			Thread.sleep(3000);
			oPage.getClickOnProjectAction().click();
			Thread.sleep(3000);
			oPage.getClickOnProjectDelete().click();
			Thread.sleep(3000);
			oPage.getClickOnProjectDeletePermanantly().click();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			
	oPage.getClickOnEditCustomer().click();
	Thread.sleep(3000);
	oPage.getClickOnActionCustomer().click();
	Thread.sleep(3000);
	oPage.getClickOnDeleteCustomer().click();
	Thread.sleep(3000);
	oPage.getClickOnDeletePermanantlyCustomer().click();
	Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(4000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}



}
