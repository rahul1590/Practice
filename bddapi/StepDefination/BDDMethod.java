package bddapi.StepDefination;

import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import io.restassured.http.ContentType;

public class BDDMethod
{
	public static void pathparameter()
	{
		
		given()
		.contentType(ContentType.JSON).
		with()
		.pathParam("page",2)
		  .when()
		  .get("https://reqres.in/api/users/{page}").
		  then()
				  .statusCode(200).and().assertThat().body("first_name",equalTo("Janet"))
				  .header("Content-Type","application/json");
		
	}
	
	public static void getWeatherdetails()
	{
		given()
		.when()
		.get("httP://get.com")
		.then()
		.statusCode(200)
		.assertThat().body("City",equalTo("hydrabad"))
		.header("Content-Type","application/json");
	}

}
