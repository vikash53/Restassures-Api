package waysToPostRequest;

import java.util.Random;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatingAResourceUsingJSONObject {
	@Test
	public void create() {
		Random ran = new Random();
		int randomNumber = ran.nextInt(500);
		JSONObject jobj = new JSONObject();  
		jobj.put("created by","banty");
		jobj.put("projectName","basket"+randomNumber);
		jobj.put("status","created");
		jobj.put("teamsize",12);
		
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
.when()
       .post("http://localhost:8084/addProject")
  .then()
  .assertThat().statusCode(201)
  .log().all();
	}

}
