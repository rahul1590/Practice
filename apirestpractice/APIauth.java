package apirestpractice;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIauth {
  @Test
  public void f() 
  {
//	  int code=RestAssured.given()
//			  .auth().preemptive()
//			  .basic("ToolsQA", "TestPassword")
//			  .when()
//			  .get("https://demoqa.com/authentication/CheckForAuthentication/")
//			  .getStatusCode();
//	
//	  System.out.println("Response Code from server is"+code);
	  
	  
//	  RequestSpecification request=RestAssured.given()
//			  .auth().preemptive()
//			  .basic("ToolsQA", "TestPassword");
//	  request.header("Content-Type","application/json");
//	  Response response = request.request(Method.GET,"");
//	  String responseBody = response.getBody().asString();
//	  System.out.println("Response Body is: "+responseBody);
//	  
//	  int statuscode = response.getStatusCode();
//	  System.out.println("status code is: "+statuscode);
//	  Assert.assertEquals(200,statuscode);
	  
	  
	//Specify base URL
		RestAssured.baseURI="http://demoqa.com/authentication/CheckForAuthentication";
		
		//Basic Authentication
		PreemptiveBasicAuthScheme authscheme=new PreemptiveBasicAuthScheme();
		authscheme.setUserName("ToolsQA");
		authscheme.setPassword("TestPassword");
		
		RestAssured.authentication=authscheme;
		

		//Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response Object
		Response response=httpRequest.request(Method.GET,"/");
		
		
		  //print response in console window
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is: "+responseBody);
		
		
		//Status code validation
				int statusCode=response.getStatusCode();
		        System.out.println("Status Code is:  "  +statusCode);
		        Assert.assertEquals(statusCode, 200);
	  
	 
	  
	  
  }  
}
