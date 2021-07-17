package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

	public MasterPageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[contains(text(),'Accept all cookies')])[2]")
	private WebElement acceptAllCookiesBtn;

	@FindBy(xpath = "(//*[contains(@class,'css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0')])[4]")
	private WebElement firstsigninBtn;
	
	@FindBy(xpath = "//*[@id='input-email-address']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='input-password']")
	private WebElement pass;
	
	@FindBy(xpath = "(//*[contains(text(),'Sign in')])[10]")
	private WebElement secondSigninBtn;
	
	@FindBy(xpath = "(//*[contains(text(),'My Zoopla')])[1]")
	private WebElement myZooplaBtn;
	
	@FindBy(xpath = "(//*[contains(@class,'esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0')])[5]")
	private WebElement signOutBtn;
	

	public WebElement getAcceptAllCookiesBtn() {
		return acceptAllCookiesBtn;
	}

	public WebElement getFirstsigninBtn() {
		return firstsigninBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSecondSigninBtn() {
		return secondSigninBtn;
	}
	
	public WebElement getMyZooplaBtn() {
		return myZooplaBtn;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}

}
