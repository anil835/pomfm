package com.pomfw.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProject {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		String expectedpagetitle="actiTIME - Enter Time-Track";
		String actualpagetitle=driver.getTitle();
		
		if(actualpagetitle.equals(expectedpagetitle))
		{
			System.out.println("the expected page is displayed---."+expectedpagetitle);
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("the expected page is not displayed--->"+actualpagetitle);
			System.out.println("testcase is failed");
		}
		
		driver.findElement(By.xpath("//div[text()='TASKS']/../../a[1]")).click();
		WebDriverWait wait3 = new WebDriverWait(driver,20);
		wait3.until(ExpectedConditions.titleContains("actiTIME - Task List"));
		String expectedtasklistpage="actiTIME - Task List";
		String actualtasklistpage=driver.getTitle();
		
		if(actualtasklistpage.equals(expectedtasklistpage))
		{
			System.out.println("the expected page is displayed---."+expectedtasklistpage);
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("the expected page is not displayed--->"+actualtasklistpage);
			System.out.println("testcase is failed");
		}
		
		
		
		driver.findElement(By.xpath("//div[text()='Add New']/../../div[1]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'item createNewCustomer ellipsis')]")).click();
		
		//find the customer name textbox and enter the customer name
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Ani");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Hi Hello Ani");
		driver.findElement(By.xpath("//span[text()='Create Customer']/../../div[1]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();
	}

}
