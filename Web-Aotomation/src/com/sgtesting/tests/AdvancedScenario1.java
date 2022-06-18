package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario1 {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		create3Users();
		logout();
		loginUser1();
		logout();
		loginUser2();
		logout();
		loginUser3();
		logout();
		login();
		modifyPasswordForUser123();
		logout();
		loginUser1A();
		logout();
		loginUser2A();
		logout();
		loginUser3A();
		logout();
		login();
		deleteUser123();
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
			Thread.sleep(5000);
	
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
	
	private static void create3Users()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("1");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("2");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("3");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
	}
	private static void logout()
	{
		try {
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
		}
	}
	
	private static void loginUser1()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(5000);
			o.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginUser2()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(5000);
			o.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginUser3()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(5000);
			o.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyPasswordForUser123()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//span[text()='1, user']")).click();
			Thread.sleep(5000);
			o.findElement(By.name("password")).clear();
			o.findElement(By.name("password")).sendKeys("12345");
			o.findElement(By.name("passwordCopy")).clear();
			o.findElement(By.name("passwordCopy")).sendKeys("12345");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//span[text()='2, user']")).click();
			Thread.sleep(5000);
			o.findElement(By.name("password")).clear();
			o.findElement(By.name("password")).sendKeys("12345");
			o.findElement(By.name("passwordCopy")).clear();
			o.findElement(By.name("passwordCopy")).sendKeys("12345");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//span[text()='3, user']")).click();
			Thread.sleep(5000);
			o.findElement(By.name("password")).clear();
			o.findElement(By.name("password")).sendKeys("12345");
			o.findElement(By.name("passwordCopy")).clear();
			o.findElement(By.name("passwordCopy")).sendKeys("12345");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			
		}
	}
	
	private static void loginUser1A()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(5000);
			o.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void loginUser2A()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(5000);
			o.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void loginUser3A()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(5000);
			o.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(5000);
			o.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser123()
	{
		try {
			
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(5000);
		o.findElement(By.xpath("//span[text()='1, user']")).click();
		Thread.sleep(5000);
		o.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(5000);
		Alert q=o.switchTo().alert();
		q.accept();
		Thread.sleep(5000);
		
		o.findElement(By.xpath("//span[text()='2, user']")).click();
		Thread.sleep(5000);
		o.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(5000);
		Alert qq=o.switchTo().alert();
		q.accept();
		Thread.sleep(5000);
		
		o.findElement(By.xpath("//span[text()='3, user']")).click();
		Thread.sleep(5000);
		o.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(5000);
		Alert qqq=o.switchTo().alert();
		q.accept();
		Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
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