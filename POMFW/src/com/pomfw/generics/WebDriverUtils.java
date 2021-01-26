package com.pomfw.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils 

//* This Method is used to Verify The Title Page*//
{
	public static void VerifyPage(WebDriver driver,String ExpectedTitlePage)
	{
		String ActualPageTitle = driver.getTitle();
		if(ActualPageTitle.equals(ExpectedTitlePage))
		{
			System.out.println("The Expected Title Page Is Displayed"+ExpectedTitlePage);
			System.out.println("TestCase Is Pass");
		}
		else
		{
			System.out.println("The Expected Title Page Is Not Displayed"+ExpectedTitlePage);
			System.out.println("TestCase Is Fail");
		}
	}
	
	
	public static void TakesScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File des = new File("./photo/Anil.png");
		 FileUtils.copyFile(src, des);
	}

}
