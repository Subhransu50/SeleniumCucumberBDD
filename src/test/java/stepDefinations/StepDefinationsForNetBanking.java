package stepDefinations;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinationsForNetBanking {
	@Given("User is on NetBanking landing page with url {string}")
	public void user_is_on_net_banking_landing_page_with_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("url opening "+string);
	}
	/*@When("User login into application with username {string} and password {string}")
	public void user_login_into_application_with_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login with cred "+string+" and "+string2);
	}*/
	@Then("Home page is populated with status {string}")
	public void home_page_is_populated_with_status(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Landed to Homepage with status "+string);
	}
	@Then("Balance would be displayed")
	public void balance_would_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Balance would be displayed");
	}
	
	
	@When("User perform signIn")
	public void pser_Perform_SignIn(DataTable data) {
	 List<List<String>> signUpData=data.asLists();
	 System.out.println("First Name is "+signUpData.get(1).get(0));
	 System.out.println("Last Name is "+signUpData.get(1).get(1));
	 System.out.println("Address is "+signUpData.get(1).get(2));
	 System.out.println("Mobile Number is "+signUpData.get(1).get(3));
	 System.out.println("Country is "+signUpData.get(1).get(4));
		
	}
	@Then("Click on SignIn button")
	public void click_On_SignIn_Button() {
	    // Write code here that turns the phrase above into concrete actions
		
	}
	@Then("A message with {string} should display")
	public void message_With_Should_Display(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string+" Message Displayed");
	}
	 @When("^User login into application with username (.+) and password (.+)$")
     public void user_login1_into_application_with_username_and_password(String uname, String password)  {
	       System.out.println("UserName is "+uname);
	       System.out.println("Password is "+password);
    }
	 
	 @Given("Open the respective browser")
     public void open_The_Respective_Browser()
     {
		 System.out.println("Open the respective browser");
     }
	 @When("Browser is triggered")
	 public void browser_Is_Triggered()
	 {
		 System.out.println("Browser is triggered"); 
	 }
	 @Then("Hit the url")
	 public  void hit_The_Url()
	 {
		 System.out.println("Hit the url");
	 }
	 @Then("Maximize the Browser Window")
	 public void maximize_The_Browser_Window()
	 {
		 System.out.println("Maximize the Browser Window");
	 }
	 @Then("Delete all the browser cookies")
	 public void delete_All_The_Browser_Cookies()
	 {
		 System.out.println("Delete all the browser cookies");
	 }
}
