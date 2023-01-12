package apirestpractice;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getrequest {
  @Test
  public void f() {
	  RestAssured.baseURI ="https://reqres.in";
	  
	  RequestSpecification httpRequest =RestAssured.given();
	  
	  Response response = httpRequest.request(Method.GET,"/api/users?page=2");
	  
	  int statuscode = response.getStatusCode();
	  System.out.println("status code is: "+statuscode);
	  Assert.assertEquals(statuscode, 200);
	  
	  String statusLine = response.getStatusLine();
	  System.out.println("Status Line is :"+statusLine);
	  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	  
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is: "+responseBody);
	  
	 
  }
}
