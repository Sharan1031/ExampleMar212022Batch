package com.sgtesting.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignTwo {
public static WebDriver oBrowser = null;
public static ActiTimePage oPage = null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
	
	private static void createUser()
	{
		try
		{
			
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnAddUser().click();
			Thread.sleep(2000);
			oPage.getClickOnFirstNAme().sendKeys("User");
			Thread.sleep(2000);
			oPage.getClickOnLastNAme().sendKeys("Demo");
			Thread.sleep(2000);
			oPage.getClickOnEmail().sendKeys("user@gmail.com");
			Thread.sleep(2000);
			oPage.getClickOnUserDetails().sendKeys("DemoUser");
			Thread.sleep(2000);
			oPage.getClickOnPassword().sendKeys("welcome1");
			Thread.sleep(2000);
			oPage.getClickOnRetypePassword().sendKeys("welcome1");
			Thread.sleep(2000);
			oPage.getClickOnSaveUser().click();
			Thread.sleep(2000);
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try {
			
			oPage.getClickOnUserCreated().click();
			Thread.sleep(2000);
			oPage.getClickOnPassword().sendKeys("password1");
			Thread.sleep(2000);
			oPage.getClickOnRetypePassword().sendKeys("password1");
			Thread.sleep(2000);
			oPage.getClickOnSaveChanges().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			
			oPage.getClickOnUserCreated().click();
			Thread.sleep(2000);
			oPage.getClickOnDelete().click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oPage.getLogout();
			Thread.sleep(3000);
			
			
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
