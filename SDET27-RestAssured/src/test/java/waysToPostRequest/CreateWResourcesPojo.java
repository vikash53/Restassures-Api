package waysToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojo.PojoLibrary;

public class CreateWResourcesPojo {
	@Test
	
	public void create() {
		PojoLibrary pojo = new PojoLibrary("vikash",11,976940,"vikashavit27@gmail.com");
		given()
		.body(pojo)
		.contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201)
	.contentType(ContentType.JSON)
	.log().all();
		
	
	}

}
