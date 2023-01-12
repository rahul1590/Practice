package apirestpractice;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putrequest {

			 @Test
		  public void f() {
		 RestAssured.baseURI ="https://reqres.in/";
	 
		  RequestSpecification httpRequest =RestAssured.given();
		  //for request Payload sending along with post request
		  JSONObject requestparam = new JSONObject(); 
		  
		  requestparam.put("name","morpheus");
		  requestparam.put("job", "manager");
		  httpRequest.header("Content-Type","application/json");
		  httpRequest.body(requestparam.toJSONString());
		  
		  Response response = httpRequest.request(Method.PUT,"/api/users/2");
		  
		  String responseBody = response.getBody().asString();
		  System.out.println("Response Body is: "+responseBody);
		  
		  int statuscode = response.getStatusCode();
		  System.out.println("status code is: "+statuscode);
		  Assert.assertEquals(200,statuscode);
		 }
	

}
