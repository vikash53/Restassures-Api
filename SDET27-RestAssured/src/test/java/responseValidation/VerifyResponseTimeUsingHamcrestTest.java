package responseValidation;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
public class VerifyResponseTimeUsingHamcrestTest {
	@Test
	public void Verify() {
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(5L),TimeUnit.MILLISECONDS)
		.log().all();
	}
     
}
