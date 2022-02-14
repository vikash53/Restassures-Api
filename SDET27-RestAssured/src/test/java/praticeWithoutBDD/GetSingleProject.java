package praticeWithoutBDD;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	@Test
	
	public void getSingleProject() {
		// step:1 perform the action
		
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_003");
		
		// step : 2  verify
		System.out.println(resp.prettyPeek());
		
		
	}

		
	

}
