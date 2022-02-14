package praticeCURDWithBDD;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class UpdateTest {
 @Test
 
 public void update() {
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
	//.put("http://localhost:8084/projects/TY_PROJ_202");
	.put("http://localhost:8084/projects/TY_PROJ_202")
.then()
	.assertThat().contentType(ContentType.JSON)
	.statusCode(200)
	.log().all();
		
		
		
		
		
		
		
		
 }


}
 
 

