package bddapi.StepDefination;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostRequest {
	
//		
//		
//	
//	 @Given("^Open URI given$")
//	    public void open_uri_given() throws Throwable {
//	//	 String requestbody = "{\"email\", \"eve.holt@reqres.in\",\"password\", \"peter@klaven\"}";
////		 HashMap<String,String> payload = new HashMap<>();
////		 payload.put("name", "morpheus");
////		 payload.put("job", "leader");
//		 
//		 JSONObject body_json = new JSONObject();
//		 body_json.put("name", "morpheus");
//		 body_json.put("job", "leader");
////	    	RestAssured.baseURI="https://reqres.in/";
////	    	RestAssured.basePath="api/users";
//		 HashMap<String,String> headers = new HashMap<String,String>();
//		 headers.put("Content-Type", "application/json");
//		 given().headers(headers).body(body_json);
//	    }
//
//	    @When("^Enter attirbute and values$")
//	    public void enter_attirbute_and_values() throws Throwable {
//	    	when().post("https://reqres.in/api/users").then().statusCode(201);
//	    }
//
//	    @Then("^I validate the outcomes$")
//	    public void i_validate_the_outcomes() throws Throwable {
//	    	
//	        
//	    }
//
//	    @And("^  Enter parameter$")
//	    public void enter_parameter() throws Throwable {
//	        
//	    }

}
