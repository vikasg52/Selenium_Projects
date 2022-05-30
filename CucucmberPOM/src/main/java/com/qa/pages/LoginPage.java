package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase {

	// Page Factory
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[contains(text()'Sign Up')]")
	WebElement SignUpBtn;

//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
	}

}