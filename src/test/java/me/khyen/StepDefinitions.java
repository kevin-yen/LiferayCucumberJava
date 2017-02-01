package me.khyen;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class StepDefinitions {

	@When("^I run this correctly$")
	public void I_run_this_correctly() {
		System.out.println("test");
	}

	@Given("^Something here$")
	public void Something_here() {
		System.out.println("something here");
	}

}
