package bddapi.StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.json.simple.JSONObject;

public class Postrequest2 
{
		RequestSpecification request;
		Response response;
	 @Given("^Open URI given$")
	    public void open_uri_given() throws Throwable {
		
		 request= given().baseUri("https://reqres.in/");
				 
	    }

	    @When("^Enter attirbute and values$")
	    public void enter_attirbute_and_values() throws Throwable {
	    	 JSONObject body_json = new JSONObject();
			 body_json.put("name", "morpheus");
			 body_json.put("job", "leader");
	    	 HashMap<String,String> headers = new HashMap<String,String>();
			 headers.put("Content-Type", "application/json");
	    	response = request.headers(headers).body(body_json).when().post("api/users");
	    }

	    @Then("^I validate the outcomes$")
	    public void i_validate_the_outcomes() throws Throwable {
	    	
	        response.then().assertThat().body("name",equalTo("morpheus2")).statusCode(201);
	    }



}
