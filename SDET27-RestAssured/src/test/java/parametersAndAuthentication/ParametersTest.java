package parametersAndAuthentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class ParametersTest {
@Test

public void params() {
	given()
	.pathParam("username","asm96")
	.queryParam("sort","created")
	.queryParam("per_page", "1000")
	.when()
	.get("https://api.github.com/users/{username}/repos")
	.then()
	.assertThat().statusCode(200)
	.log().all();
}
     
}
