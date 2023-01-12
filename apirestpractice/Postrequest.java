package apirestpractice;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postrequest {
  @Test
  public void f() {
	  RestAssured.baseURI ="https://reqres.in/";
	  
	  RequestSpecification httpRequest =RestAssured.given();
	  
	  
	  
	  //for request Payload sending along with post request
	  JSONObject requestparam = new JSONObject(); 
	  
	  requestparam.put("name","morpheus");
	  requestparam.put("job", "leader");
	  
	  httpRequest.header("Content-Type","application/json");
	  httpRequest.body(requestparam.toJSONString());
	  
	  Response response = httpRequest.request(Method.POST,"api/users");
	  
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is: "+responseBody);
	  
	  int statuscode = response.getStatusCode();
	  System.out.println("status code is: "+statuscode);
	  Assert.assertEquals(201,statuscode);
//	  
	  String name = response.jsonPath().get("name");
	  System.out.println("name is: "+name);
	  Assert.assertEquals(name, "morpheus");
//	  
//	  //validating header
	  String contenttype = response.header("Content-Type");
	  System.out.println("contenttype is: "+contenttype);
	  Assert.assertEquals(contenttype, "application/json; charset=utf-8");
	  
	  //Get all header values
	  Headers allheadervalue = response.headers();
	  for(Header h:allheadervalue)
	  {
		  System.out.println(h.getName()+" "+h.getValue());
	  }
	  
	  Assert.assertEquals(responseBody.contains("name"), true); 
	  
  }
  
 
}
