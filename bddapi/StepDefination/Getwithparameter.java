package bddapi.StepDefination;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

public class Getwithparameter {
	  @Given("^I do get operation on page$")
	    public void i_do_get_operation_on_page() throws Throwable {
		 
			
	    }

	    @When("^ we pass addition parameter$")
	    public void we_pass_addition_parameter() throws Throwable {
	    	 BDDMethod.pathparameter();
	    }

	    @Then("^I validate the first name$")
	    public void i_validate_the_first_name() throws Throwable {
	    
	    }

	    @And("^status code$")
	    public void status_code() throws Throwable {
	        
	    }


	  
}
