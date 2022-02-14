package praticeWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void updateProject() {
		//step create project
		JSONObject jObj=new JSONObject();
		jObj.put("created by","vikash");
		jObj.put("projectName","Bigbasket");
		jObj.put("status","completed");
		jObj.put("teamsize",12);
		
		//step2:  to provide request Specification
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObj);
		
		// step :3 preformthe action
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_404");
		 //step 4 verify
		ValidatableResponse validate = resp.then();
		validate.assertThat().statusCode(200);
		validate .log().all();
		
		
	}

}
