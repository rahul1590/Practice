package apirestpractice;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIauth3 {
  @Test
  public void f() {
	  RestAssured.baseURI ="https://bookstore.toolsqa.com/";
	  
	  RequestSpecification httpRequest =RestAssured.given();
	  
	  String credential = "TOOLSQA-Test:Test@@123";
	  
	  byte[] encodedCredential = Base64.encodeBase64(credential.getBytes());
	  
	  String encodedCredentialsAsString = new String(encodedCredential);
	  
	  httpRequest.header("Authorization","Basic"+encodedCredentialsAsString);
	  Response response = httpRequest.request(Method.POST,"/BookStore/V1/Books");
	  int statuscode = response.getStatusCode();
	  System.out.println("status code is: "+statuscode);
	  String responseBody = response.getBody().asString();
	  System.out.println("Response Body is: "+responseBody);
	  
	  
  }
}
