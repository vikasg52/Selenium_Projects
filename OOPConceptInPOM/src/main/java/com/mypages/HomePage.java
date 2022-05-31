package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private By header = By.className("private-page__title");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public String getHomePageTitle() {
		return getPageTitle();
	}

	public String getHomagePageHeader() {
		return getPageHeader(header);
	}

}
