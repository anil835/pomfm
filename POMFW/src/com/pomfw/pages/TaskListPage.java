package com.pomfw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='TASKS']/../../a[1]")
	private WebElement taskBTN;
	
	@FindBy(xpath="//div[text()='Add New']/../../div[1]")
	private WebElement addnewBTN;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomerBTN;
	

	@FindBy(xpath="+ New Project")
	private WebElement newprojectBTN;
	

	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement addnewtaskBTN;
	
	@FindBy(xpath="//div[text()='Create new tasks']")
	private WebElement createnewtaskBTN;
	
	@FindBy(xpath="//div[text()='Import tasks from CSV']")
	private WebElement importtaskfroCSVBTN;
	
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public void clickontaskBTN()
	{
		taskBTN.click();;
	}

	public void clickonAddnewBTN() {
	    addnewBTN.click();;
	}



	public void clickonNewcustomerBTN() {
		newcustomerBTN.click();;
	}



	public void clickonNewprojectBTN() {
	    newprojectBTN.click();;
	}



	public void clickonAddnewtaskBTN() {
		addnewtaskBTN.click();;
	}



	public void getCreatenewtaskBTN() {
		createnewtaskBTN.click();;
	}



	public void getImporttaskfroCSVBTN() {
		importtaskfroCSVBTN.click();;
	}
	
	public void verifyHomepage(WebDriver driver,String expectedtaskpage)
	{
		String actualtaskpage= driver.getTitle();
		
		if(actualtaskpage.equals(expectedtaskpage))
		{
			System.out.println("the expected page is displayed");
			System.out.println("testcase is pass");
			
		}
		else
		{
			System.out.println("the expected page not is displayed");
			System.out.println("testcase is fail");
		}
	}
	
	
	
	
	

}
