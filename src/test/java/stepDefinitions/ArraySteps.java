package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPOF;

public class ArraySteps {
	public ArrayPOF arraypagefactory = new ArrayPOF();
	
	@Given("The user is on the home page of DS-ALGO application")
	public void the_user_is_on_the_home_page_of_ds_algo_application() {
	    System.out.println("The user is on user ds-algo page");
	}

	@When("The user select the drop down option and select the array option")
	public void the_user_select_the_drop_down_option_and_select_the_array_option() {
	    // Write code here that turns the phrase above into concrete actions
		arraypagefactory.array_dropdown();
	}

	@Then("The user lands in the arrays Datastructure page")
	public void the_user_lands_in_the_arrays_datastructure_page() {
		arraypagefactory.getArraypageTitle();
	}




}
