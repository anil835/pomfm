package com.pomfw.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckProductEdition {
	
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
		driver.findElement(By.xpath("//div[contains(@class,'popup_menu_label')]")).click();
		driver.findElement(By.linkText("Licenses")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.titleContains("actiTIME - Licenses"));
		String expectedlcpagetitle="actiTIME - Licenses";
		String actuallcpagetitle=driver.getTitle();
		if(actuallcpagetitle.equals(expectedlcpagetitle))
		{
			System.out.println("the expected page is displayed"+expectedlcpagetitle);
			System.out.println("testcase is continue");
		}
		else
		{
			System.out.println("the expected page not displayed"+actuallcpagetitle);
			System.out.println("bug");
		}
		
		String expectedproductedition="actiTIME 2017.4";
		WebElement productedition = driver.findElement(By.xpath("//nobr[text()='Product Edition:']/../../td[2]"));
		String actualproductedition=productedition.getText();
		if(actualproductedition.equals(expectedproductedition))
		{
			System.out.println("the expected productedition is displayed"+expectedproductedition);
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("the expected productedition not displayed"+actualproductedition);
			System.out.println("testcase is fail");
			
		}
		
		
		String expectedissuedate="Jul 14, 2017";
		WebElement issuedate = driver.findElement(By.xpath("//nobr[text()='Issue Date:']/../../td[2]"));
		String actualissuedate=productedition.getText();
		if(actualissuedate.equals(expectedissuedate ))
		{
			System.out.println("the expected issuedate displayed"+expectedissuedate);
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("the expected issuedate not displayed"+actualissuedate);
			System.out.println("testcase is fail");
			
		}
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();
		
	} 

}
