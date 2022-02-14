package com.authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
public class Auth2 {
	@Test
	
	public void auths() {
		Response response = given()
				.formParams("client_id", "sdet-27")
				.formParam("client_secret", "cbe2f52e08ac4400562edffb29440ead")
				.formParams("grant_type", "client_credentials")
				.formParams("redirect_uri", "http://example.com")
		.when()
		     .post("http://coop.apps.symfonycasts.com/token");
	             String token = response.jsonPath().get("access_token");
		
		given()
		      .auth().oauth2(token)
		      .pathParam("USER_ID", "2776")
		     .when()
		     .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		     .then()
		     .log().all();
		      
		      
		      
		      
		      
		    
		      
		      
		      
		      
		      
		      
	}

}
