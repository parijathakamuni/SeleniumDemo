package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractionDemo {

	//scope of webdriver
	WebDriver driver;
	
	public static void main(String[] args) {

		AbstractionDemo abstractiondemo = new AbstractionDemo();
		abstractiondemo.login();
		abstractiondemo.logout();

		
	}
	
	//creating method and can be reused
	
	public void login() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parij\\eclipse-workspace\\SeleniumDemo\\src\\Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://opesnsource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	

	//In order to logout we have to login first
	
	public void logout()
	{
		//driver.findElement(By.linkText("")).click();
		//driver.findElement(By.xpath("a[text[]='btn-logout']")).click();
	}
	
	public void dropdown() {
		Select dropdown = new Select(driver.findElement(By.id("idtext")));
		/*select class provides 3 ways to select the values 
		1. SelectByIndex
		2. SelectByValue
		3. SelectByVisibleText*/
		
		dropdown.selectByVisibleText("ESS");
		dropdown.selectByIndex(0);
		dropdown.deselectByValue("");
	
	}
	
}

