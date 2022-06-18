package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		minimizeFlyOutWindow();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
		
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\TestAutomation\\Automation\\Web-Aotomation\\Library\\drivers\\chromedriver.exe");	
			o=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			o.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try {
			o.findElement(By.name("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}


	private static void createCustomer()
	{
		try {
			o.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer111");
			o.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try {
			o.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project999");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createTask()
	{
		try {
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[3]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task123");
			Thread.sleep(2000);
			o.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteTask()
	{
		try {
			o.findElement(By.xpath("//div[text()='Task123']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			o.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try {
			
			o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try {
			o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void logout()
	{
		try {
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try {
			o.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
