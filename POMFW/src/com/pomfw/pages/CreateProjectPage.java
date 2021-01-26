package com.pomfw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage {
	
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBTN;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newprojectBTN;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement enterProjectNameTab;
	
	@FindBy(id="ext-gen23")
	private WebElement selectCustomerListBox;
	
	@FindBy(xpath="//span[text()='Create Project']/../../div[1]")
	private WebElement createProjectBTN ;
	
	
	public CreateProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonAddnewBTN()
	{
		addnewBTN.click();
		
	}


	public void  clickonNewprojectBTN() {
		newprojectBTN.click();;
	}


	public void EnterProjectNameTab(String pm) {
		enterProjectNameTab.sendKeys(pm);;
	}


	public void clickCustomerListBox() {
		selectCustomerListBox.click();;
	}


	public void clickonCreateProjectBTN() {
		createProjectBTN.click();;
	}
	



}
