package apirestpractice;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
  @Test
  public void f() {
 RestAssured.baseURI ="https://reqres.in/";
	  
	  RequestSpecification httpRequest =RestAssured.given();
	  httpRequest.header("Content-Type","application/json");
  	  Response response = httpRequest.request(Method.DELETE,"/api/users/2");
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is: "+responseBody);
	  
	  int statuscode = response.getStatusCode();
	  System.out.println("status code is: "+statuscode);
	  Assert.assertEquals(statuscode,204);
  }
}
