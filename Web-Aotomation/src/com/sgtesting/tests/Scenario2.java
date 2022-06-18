package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
	public static WebDriver o=null;

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
			
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			
		}
	}
	
	private static void createUser()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("123");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user123");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
	}
	
	private static void modifyUser()
	{
		try {
			o.findElement(By.xpath("//span[text()='123, user']")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).clear();
			o.findElement(By.name("firstName")).sendKeys("Sharana Basava");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}
	private static void deleteUser()
	{
		try {
			o.findElement(By.xpath("//span[text()='123, Sharana Basava']")).click();
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert q=o.switchTo().alert();
			q.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
	}
	private static void logout()
	{
		try {
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			o.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}