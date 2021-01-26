package com.pomfw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement CheckBoxBTN;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement logiBTN;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//public void LoginPage(WebDriver driver)
	//{
		//PageFactory.initElements(driver, this);
	//}

	public void getUnTB(String un) {
		unTB.sendKeys(un);;
	}

	public void getPwTB(String pw) {
		pwTB.sendKeys(pw);;
	}

	public void ClickOnCheckBoxBTN() {
		CheckBoxBTN.click();;
	}

	public void ClickOnLogiBTN() {
		logiBTN.click();;
	}
	
	public void login()
	{
		unTB.sendKeys("admin");
		pwTB.sendKeys("manager");
		CheckBoxBTN.click();
		logiBTN.click();
	}
	public void login(String un, String pw)
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		CheckBoxBTN.click();
		logiBTN.click();
		
		
		
	}
	

	
	

}
