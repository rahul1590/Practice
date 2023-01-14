package bddapi.StepDefination;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

		RequestSpecification request;
		Response response;
		  @Given("^Update username$")
		    public void update_username() throws Throwable {
			  request= given().baseUri("https://reqres.in/");
		    }

		    @When("^I change username$")
		    public void i_change_username() throws Throwable {
		    	JSONObject body_json = new JSONObject();
				 body_json.put("name", "swapnil");
				 body_json.put("job", "leader");
		    	 HashMap<String,String> headers = new HashMap<String,String>();
				 headers.put("Content-Type", "application/json");
		    	response = request.headers(headers).body(body_json).when().put("api/users/2");
		    }

		    @Then("^I validate that it is updated successfully$")
		    public void i_validate_that_it_is_updated_successfully() throws Throwable {
		    	response.then().assertThat().body("name",equalTo("swapnil")).statusCode(200);
		    }


	

}
