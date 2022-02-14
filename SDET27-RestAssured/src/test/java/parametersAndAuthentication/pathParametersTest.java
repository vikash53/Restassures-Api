package parametersAndAuthentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class pathParametersTest {
	@Test
	
	public void param() {
		String proId="TY_PROJ_1602";
		given()
		.pathParam("projectId", proId)
		.when()
		.delete("http://localhost:8084/projects/{projectId}")
		.then()
		.log().all();
	}

}
