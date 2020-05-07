package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DailyTaskDefinition {

	@Given("Every scenario")
	public void Every_scenario() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("BG_A");
	}

	@When("when before all scenario")
	public void when_before_all_scenario() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("BG_B");
	}

	@Then("then before all scenario")
	public void then_before_all_scenario() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("BC_C");
	}
}
