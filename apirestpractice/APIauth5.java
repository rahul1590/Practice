package apirestpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIauth5 {
  @Test
  public void f() {
	  RequestSpecification request = RestAssured.
	  		  given()
	  		  .auth()
	  		  .oauth2("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");
//Response response= request.request(Method.GET,"https://api.github.com/repos/rahul1590/Hello");
	  Response response= request.request(Method.DELETE,"https://api.github.com/repos/rahul1590/Hello-World");
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getBody().prettyPrint());
  }
}
