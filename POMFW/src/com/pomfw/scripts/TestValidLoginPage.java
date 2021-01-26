package com.pomfw.scripts;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pomfw.generics.BaseTest;
import com.pomfw.generics.WebDriverUtils;
import com.pomfw.pages.CreateProjectPage;
import com.pomfw.pages.EnterTimeTrackPage;
import com.pomfw.pages.LoginPage;
import com.pomfw.pages.TaskListPage;

public class TestValidLoginPage extends BaseTest{
	
	static
	{
		System.setProperty("webdriver.chrome.driver ","./driver/chromedriver.exe ");
	}
	
	   

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		/*Read the data from Excel*/
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		
		String un = wb.getSheet("ValidLoginPage").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("ValidLoginPage").getRow(1).getCell(1).toString();
		String ExpectedTitle = wb.getSheet("ValidLoginPage").getRow(1).getCell(2).toString();  
		   
		 WebDriver driver =  new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://localhost/login.do");
			EnterTimeTrackPage etnp= new EnterTimeTrackPage(driver);
			etnp.verifyhomepage(driver, ExpectedTitle);
			
			//TaskListPage tslist = new TaskListPage(driver);
			//tslist.clickontaskBTN();
			//tslist.verifyHomepage(driver,ExpectedTitle);
			
			
			//CreateProjectPage cproject= new CreateProjectPage(driver);
			
			//WebDriverUtils.TakesScreenShot(driver);
			//WebDriverUtils.VerifyPage(driver, "actiTIME -  Task List");
			
			
		      //List<WebElement> listAllCustomers = driver.findElements(By.xpath("//div[text()='All Customers']"));
		      //int count = listAllCustomers.size();
		      //System.out.println(count);
		      
		      //for (WebElement customer : listAllCustomers) {
		    	//  String cn = customer.getText();
		    	  //if(cn.equals("Ani"))
		    	  //{
		    		//  customer.getText();
		    		  //break;
		    	//  }
				
		//	}
		      
		      closeBrowser();
			
	}  
		
		
	}


