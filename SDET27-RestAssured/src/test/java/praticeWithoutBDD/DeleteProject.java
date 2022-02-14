package praticeWithoutBDD;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	
	
		@Test
		
		public void deleteProject() {
			int expStatus=204;
			Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_403");
			
			
			int actStatus = resp.getStatusCode();
			Assert.assertEquals(expStatus,actStatus);
			System.out.println(resp.prettyPrint());
		   
			
			 
			
		
		
	}

}
