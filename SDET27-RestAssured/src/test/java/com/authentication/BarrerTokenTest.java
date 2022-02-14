package com.authentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class BarrerTokenTest {
	
	@Test
	public void barerAuth(){
		given()
		.auth().oauth2("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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}
	

}
