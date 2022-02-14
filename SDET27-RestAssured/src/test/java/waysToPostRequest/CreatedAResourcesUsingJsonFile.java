package waysToPostRequest;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class CreatedAResourcesUsingJsonFile {
	@Test
	
	public void created() {
		
	
	
  File file =new File("./created.json");
  given()
       .body(file)
      .contentType(ContentType.JSON)
      
      .when()
      .post("http://localhost:8084/addProject")
   .then()
   .assertThat().statusCode(201)
   .contentType(ContentType.JSON)
   .log().all();
  
}
}
