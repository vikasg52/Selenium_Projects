package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	// page locators:

	private By emailId = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//");

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// Getters:

	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}

	public void getLoginPageHeader() {
		getPageHeader(header);
	}

	public HomePage doLogin(String username, String pwd) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();

		return getInstance(HomePage.class);

	}

	public void doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();

	}

}
