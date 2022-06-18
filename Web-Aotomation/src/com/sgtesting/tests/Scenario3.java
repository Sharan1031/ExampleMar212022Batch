package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		minimizeFlyOutWindow();
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
