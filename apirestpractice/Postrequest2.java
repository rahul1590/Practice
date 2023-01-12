package apirestpractice;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postrequest2 {
  @Test
  public void f() 
  {
	  RestAssured.baseURI ="https://reqres.in/";
	  RequestSpecification httpRequest =RestAssured.given();
	  
	  //for request Payload sending along with post request
	  JSONObject requestparam = new JSONObject(); 
	  
	  requestparam.put("email","eve.holt@reqres.in");
	  requestparam.put("password","cityslicka");
	  
	  //Request Object
	  httpRequest.header("Content-Type","application/json");
	  httpRequest.body(requestparam.toJSONString());
	  
	  //Response Object
	  Response response = httpRequest.request(Method.POST,"/api/login");
	  
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is: "+responseBody);
	  
	  int statuscode = response.getStatusCode();
	  System.out.println("status code is: "+statuscode);
	  Assert.assertEquals(statuscode, 200);
	  
	  String token = response.jsonPath().get("token");
	  System.out.println("token is: "+token);
	  Assert.assertEquals(token, "QpwL5tke4Pnpja7X4");
  }
}
