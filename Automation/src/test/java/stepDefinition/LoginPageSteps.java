package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("Navigated to url");
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) {
		System.out.println(string);
		System.out.println(string2);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		System.out.println("Homepage is populated");
	}

	@Then("Cards are displayed as {string}")
	public void cards_are_displayed_as(String string) {
		System.out.println(string);
	}
}
