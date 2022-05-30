package com.qa.stepDefinitions;

import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase {
	LoginPage loginpage = new LoginPage();

	@Given("user opens browser")
	public void user_opens_browser() throws Throwable {
		TestBase.initializeDriver();
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
		String title = loginpage.validateLoginPageTitle();

	}

	@Then("user logs into app")
	public void user_logs_into_app() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
