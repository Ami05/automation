package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTaskDefinition {

	@Given("I want to add {int} numbers")
	public void i_want_to_add_numbers(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("a");
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("B");
	}

	@Then("The sum would be {int}")
	public void the_sum_would_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("C");
	}
	
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The user Heading");
	}

	@When("I enter Username as {string} and Password as {string}") 
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2){ 
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1+" ----  " + arg2);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The user is logged in");
	}

	@Then("Home page can see the text {string}")
	public void home_page_can_see_the_text(String wlcmStatement) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(wlcmStatement);
	}

	
}
