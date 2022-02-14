package waysToPostRequest;

import java.util.HashMap;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateAResourcesUsingHashMap {
	@Test
	public void created()
	{
		HashMap map = new HashMap();
		map.put("cteatedby", "vikash");
		map.put("projectName","bluewayer");
		map.put("status","created");
		map.put("teamsize",123);
		
	given()
	.body(map)
	.contentType(ContentType.JSON)
   .when()
   .post("http://localhost:8084/addProject")
   .then()
   .assertThat().statusCode(201)
   .contentType(ContentType.JSON)
   .log().all();
   
		
		
		
		
				
				
	}

}
