package responseValidation;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;





public class StaticResponseValidation {
	
	@Test
	
	public void verify() {
		String expectedProjectName = "timemytask";
	Response respounse = when()
			.get("http://localhost:8084/projects");
			 String actualProjectName= respounse.jsonPath().get("[0].projectName");
	respounse.then()
	.assertThat()
	.contentType(ContentType.JSON).and().statusCode(200)
	.log().all();
	
	Assert.assertEquals(expectedProjectName, actualProjectName);
	
	
	
}
}
