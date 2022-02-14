package com.pratice;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class InvalidStatusProject {
	@Test
	public void invalidStatus() {
		 Random ran = new Random();
			int randomNumber = ran.nextInt(500);
	 
		 JSONObject jobj = new JSONObject();
		 jobj.put("created_by", "deepik");
		 jobj.put("createdOn", "string");
		 jobj.put("projectId","String");
		jobj.put("projectName", "deepak_pro-3"+randomNumber);
		jobj.put("status", "AAA");
		jobj.put("teamSize", 10);
		 
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(500)
		.contentType(ContentType.JSON)
		.log().all();
	}

}
