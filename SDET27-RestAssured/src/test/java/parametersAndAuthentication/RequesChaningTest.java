package parametersAndAuthentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured.*;
public class RequesChaningTest {
	@Test
	
	public void chaning() {
		Response response = when()
			.get("http://localhost:8084/projects");
		String  proID = response.jsonPath().get("[0].projectId");
		System.out.println(proID);
		given()
		.pathParam("projectId", proID)
		  
		.when()
		.delete("http://localhost:8084/projects/{projectId}")
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
	}

}
