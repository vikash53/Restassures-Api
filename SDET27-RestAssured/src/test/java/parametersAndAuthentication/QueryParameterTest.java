package parametersAndAuthentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class QueryParameterTest {
	@Test
	
	public void param() {
	given()
	.queryParams("page","1")
	
	.when()
	.get("https://reqres.in/api/users")
	.then()
     .assertThat().statusCode(200)
	.log().all();
	}
}
