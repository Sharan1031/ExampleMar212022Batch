package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {
	public static WebDriver o=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginUser1();
		createUser2();
		logout();
		loginUser2();
		createUser3();
		logout();
		loginUser3();
		logout();
		loginUser2();
		modifyUser3Password();
		logout();
		loginUser3A();
		logout();
		loginUser1();
		modifyUser2Password();
		login();
		loginUser1A();
		logout();
		loginUser2A();
		logout();
		login();
		minimizeFlyOutWindow();
		modifyUser1Password();
		logout();
		loginUser1A();
		logout();
		loginUser2AA();
		deleteUser3();
		logout();
		loginUser1A();
		deleteUser2();
		logout();
		login();
		minimizeFlyOutWindow();
		deleteUser1();
		
		
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
			Thread.sleep(3000);

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

	private static void createUser1()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("1");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
	}
	private static void logout()
	{
		try {
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {

		}
	}

	private static void loginUser1()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("pwd")).sendKeys("1234");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser2()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("2");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
	}

	private static void loginUser2()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("pwd")).sendKeys("1234");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser3()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			o.findElement(By.name("firstName")).sendKeys("user");
			o.findElement(By.name("lastName")).sendKeys("3");
			o.findElement(By.name("email")).sendKeys("u@gmail.com");
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("password")).sendKeys("1234");
			o.findElement(By.name("passwordCopy")).sendKeys("1234");
			o.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginUser3()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("pwd")).sendKeys("1234");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUser3Password()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//span[text()='3, user']")).click();
			Thread.sleep(3000);
			o.findElement(By.name("password")).sendKeys("sharan");
			o.findElement(By.name("passwordCopy")).sendKeys("sharan");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
	}
	
	private static void modifyUser2Password()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//span[text()='2, user']")).click();
			Thread.sleep(3000);
			o.findElement(By.name("password")).sendKeys("sharan");
			o.findElement(By.name("passwordCopy")).sendKeys("sharan");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
	}
	
	private static void modifyUser1Password()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//span[text()='1, user']")).click();
			Thread.sleep(3000);
			o.findElement(By.name("password")).sendKeys("sharan");
			o.findElement(By.name("passwordCopy")).sendKeys("sharan");
			o.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {

		}
	}
	private static void loginUser3A()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user3");
			o.findElement(By.name("pwd")).sendKeys("sharan");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			
		}
	}
	
	private static void loginUser1A()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user1");
			o.findElement(By.name("pwd")).sendKeys("sharan");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			
		}
	}
	private static void loginUser2A()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("pwd")).sendKeys("sharan");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			
		}
	}
	private static void loginUser2AA()
	{
		try {
			o.findElement(By.name("username")).sendKeys("user2");
			o.findElement(By.name("pwd")).sendKeys("sharan");
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) {
			
		}
	}
	private static void deleteUser3()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//span[text()='3, user']")).click();
			Thread.sleep(3000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert i=o.switchTo().alert();
			i.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser2()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//span[text()='2, user']")).click();
			Thread.sleep(3000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert i=o.switchTo().alert();
			i.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try {
			o.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(3000);
			o.findElement(By.xpath("//span[text()='1, user']")).click();
			Thread.sleep(3000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert i=o.switchTo().alert();
			i.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}