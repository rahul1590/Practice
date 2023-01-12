package apirestpractice;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIauth2 {
  @Test
  public void f() 
  {
//	  RestAssured.baseURI ="http://api.weatherapi.com/v1/current.json"; 
	  RestAssured.baseURI ="http://api.weatherapi.com/v1/forecast.json";
//	  RestAssured.baseURI ="http://api.weatherapi.com/v1/search.json";
	  
	//  RequestSpecification httpRequest = RestAssured.given().queryParam("key", "582a4b5c04594e1a9f6172811222012").queryParam("q", "London");
	  RequestSpecification httpRequest = RestAssured.given().param("q", "07112").param("days","2").param("key", "582a4b5c04594e1a9f6172811222012");
	  //  RequestSpecification httpRequest = RestAssured.given().formParam("key", "582a4b5c04594e1a9f6172811222012").formParam("q", "York");
		
	  Response response = httpRequest.request(Method.GET,"");
	  
//	  System.out.println();
//	  System.out.println();
	  String responseBody = response.getBody().prettyPrint();
	  System.out.println("Response Body is: "+responseBody);
	  
	  int statuscode = response.getStatusCode();
	  System.out.println("status code is: "+statuscode);
	  Assert.assertEquals(200,statuscode);
  }


}
