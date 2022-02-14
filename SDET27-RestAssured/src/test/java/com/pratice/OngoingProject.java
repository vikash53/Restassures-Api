package com.pratice;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.Random;

public class OngoingProject {
	@Test

	public void onGoingProject() {
		Random ran = new Random();
		int randomNumber = ran.nextInt(500);

		JSONObject jobj = new JSONObject();
		jobj.put("created_by", "deepik");
		jobj.put("createdOn", "string");
		jobj.put("projectId","String");
		jobj.put("projectName", "deepak_pro-2"+randomNumber);
		jobj.put("status", "On Going");
		jobj.put("teamSize", 10);

		Response res = given()
				.body(jobj)
				.contentType(ContentType.JSON)
				.when()
				.post("http://localhost:8084/addProject");
		res.then()
		.assertThat().statusCode(201)
		//.log().all() ; 
		.log().body()
		.extract().response();
	
		String jsonString = res.asString();
		
		Assert.assertEquals(jsonString.contains("On Going"), true);
		//Assert.assertEquals(jsonString.contentEquals(jsonString),true);


	}
}