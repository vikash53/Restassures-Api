package parametersAndAuthentication;

import java.util.Random;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSender;

public class RequestChaningPostDetete {
	@Test
	
	public void postDelete() {
		Random ran = new Random();
		int randomNumber = ran.nextInt(500);
		JSONObject jObj=new JSONObject();
		 
		jObj.put("created by","vikash");
		jObj.put("projectName","basket"+randomNumber);
		jObj.put("status","created");
		jObj.put("teamsize",123);
		
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		RequestSender response = when()
		.post("https")
		
		
		
	}
	

}
