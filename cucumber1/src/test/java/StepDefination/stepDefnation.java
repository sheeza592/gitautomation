package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDefnation {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println(" given Precondition");
	 
	}

	@And("some other precondition")
	public void some_other_precondition() {
	    System.out.println(" and some other statements");
	
	}

	@When("I complete action")
	public void i_complete_action(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(" when complete");
	    
	}




}
