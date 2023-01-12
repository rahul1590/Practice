package apirestpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIauth4 {
  @Test
  public void f() 
  {
	  RequestSpecification request = RestAssured.
			  		  given()
			  		  .auth()
			  		  .oauth2("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");
	  
	//for request Payload sending along with post request
	  JSONObject requestparam = new JSONObject(); 
	  
	  requestparam.put("name","Test old s12");
	  requestparam.put("description","This is your second repo!");
	  requestparam.put("homepage","https://github.com");
	  requestparam.put("private","false");
	  requestparam.put("is_template","true");
		
	  request.header("Content-Type","application/json");
	  request.body(requestparam.toJSONString());
	  
	  Response response= request.request(Method.POST,"https://api.github.com/user/repos");
	  
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getBody().prettyPrint());

  }
}
