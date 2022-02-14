package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class DynamicResponseValidationTest {
	@Test
	
	public void verify() {
		String expectedProjectName = "timemytask"; 
	Response response = when()
			.get("http://localhost:8084/projects");
	List<String> proName = response.jsonPath().get("projectName");
	 boolean flag = false;
	  for (String pName:proName){
		  try {
			  if(pName.equals(expectedProjectName)) {
				  flag=true;
			  }		  
		  }
			  catch(Exception e) {
			  }
	  }
	response.then()
	.assertThat()
	.contentType(ContentType.JSON).and().statusCode(200)
	.log().all();
	Assert.assertEquals(flag,true);
	
		  
				  
			  }
		  
		  
		
	
				
	}

	



