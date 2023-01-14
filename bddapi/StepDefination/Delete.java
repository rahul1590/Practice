package bddapi.StepDefination;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
	RequestSpecification request;
	Response response;
	
	  @Given("^URI to delete record$")
	    public void uri_to_delete_record() throws Throwable {
		  request= given().baseUri("https://reqres.in/");
	    }

	    @When("^I delete request$")
	    public void i_delete_request() throws Throwable {
	    	HashMap<String,String> headers = new HashMap<String,String>();
	    	headers.put("Content-Type", "application/json");
	    	response = request.headers(headers).when().delete("api/users/2");
	    }

	    @Then("^Data deleted successfully$")
	    public void data_deleted_successfully() throws Throwable {
	    	response.then().assertThat().body(equalTo("")).statusCode(200);
	    //	response.then().assertThat().statusCode(204);
	    }

}
