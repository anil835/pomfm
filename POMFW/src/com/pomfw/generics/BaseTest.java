package com.pomfw.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest implements IAutoConstant{
	static
	{
		System.setProperty("webdriver.chrome.driver ","./driver/chromedriver.exe ");
	}
	
	
	public static WebDriver driver;
	
	public static void openTheBrowser(String sBrowserName) {
		
		
				
		if(sBrowserName.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver();
		}
		else if(sBrowserName.equals("firefox"))
		{
			 driver = new FirefoxDriver();
			
		}
        else if(sBrowserName.equals("ie"))
        {
		 driver = new InternetExplorerDriver();
			
	    }
		
		//set the browser timeouts//
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//maximum the browser//
		driver.manage().window().maximize();
		
	}
	public static void openTheapplication() {
		driver.get(URL);
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
