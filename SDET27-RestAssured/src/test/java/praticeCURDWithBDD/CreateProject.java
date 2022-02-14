package praticeCURDWithBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
 @Test
 
 public void createProject() {
	Random ran = new Random();
	int randomNumber = ran.nextInt(500);
	
	JSONObject jObj = new JSONObject();
	jObj.put("created by","vikash");
	jObj.put("projectName","basket");
	jObj.put("status","created");
	jObj.put("teamsize",123);
	
	given()
	   .body(jObj)
	   .contentType(ContentType.JSON)
	.when()
	  .post("http://localhost:8084/addProject")
	.then()
	   .assertThat().statusCode(201)
	 .contentType(ContentType.JSON)
	  .log().all();
	
	
	
 }


}

