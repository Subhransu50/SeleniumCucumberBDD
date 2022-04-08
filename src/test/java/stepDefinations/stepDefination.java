package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)This is optional in latest version
public class stepDefination {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page()
	{
		System.out.println("Given");
	}
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password()
	{
		System.out.println("When");
	}
	@Then("^Home page is populated$")
	public void home_page_is_populated()
	{
		System.out.println("Then");
	}
	@And("^Cards are displayed$")
	public void cards_are_displayed()
	{
		System.out.println("And");
	}
}
