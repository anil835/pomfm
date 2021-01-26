package com.pomfw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[text()='TASKS']/../../a[1]")
	private WebElement tasktab;
	
	@FindBy(xpath="//div[contains(@class,'popup_menu_label')]")
	private WebElement settingsMenu;
	
	@FindBy(linkText="Licenses")
	private WebElement licenseslink;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutlink;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void clickonTasktab() {
		tasktab.click();;
	}

	public void clickonSettingsMenu() {
		settingsMenu.click();;
	}

	public void getLicenseslink() {
		licenseslink.click();;
	}

	public void clickonLogoutlink() {
		logoutlink.click();;
	}
	
	public void verifyhomepage(WebDriver driver,String expectedtitle)
	{
		String actualpagetitle= driver.getTitle();
		if(actualpagetitle.equals(expectedtitle))
		{
			System.out.println("the expected page is displayed---."+expectedtitle);
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("the expected page is not displayed--->"+actualpagetitle);
			System.out.println("testcase is failed");
		}
		
	}
	

}
