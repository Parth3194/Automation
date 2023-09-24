package com.qa.tutorialsninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public WebDriver driver;
	
	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAccountInfoLink;
	
	
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateEditAccountInfoLinkDisplayStatus() {
		boolean displayStatus = editYourAccountInfoLink.isDisplayed();
		return displayStatus;
	}

}
