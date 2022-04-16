package com.company.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MyFirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parij\\eclipse-workspace\\SeleniumDemo\\src\\Drivers\\chromedriver.exe");
		/*ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setHeadless(false);
		WebDriver driver = new ChromeDriver(chromeoptions);*/
		WebDriver driver=new ChromeDriver();
		driver.get("http://opesnsource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title of the page" + " " + driver.getTitle());
		/*driver.close();*/
		
		/*driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("abcdefg");
		driver.findElement(By.id("btnLogin")).click();*/
		
		/*driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("ajsdhjash");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();*/
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("username");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("ksjdhlkjsdhf");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("myuser");
		
		// test comment
		//Abstraction is the process of hiding the implementation details from the user
		//Example : sending email from gmail we write email, subject, send.
		//but internal things happend how the gmail is sending and whats happening in the backend..
		//so these are hiding from the user
		
	}

}


