package responseValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojo.PojoClass1;

import static io.restassured.RestAssured.*;
public class DataProvider {
	
	@Test(dataProvider="getData")
	public void Create(String createdBy,String projectName,String status,int teamSize) {
		PojoClass1 pojo = new PojoClass1(createdBy,projectName,teamSize);
		
		given()
		.body(pojo)
		.contentType(ContentType.JSON)
		
      .when()
       .patch("http://localhost:8084/addproject")
     .then()  
     .assertThat().statusCode(200)
     .log().all();
	}
	@org.testng.annotations.DataProvider
	
	public Object[][] getData(){
		Object[][] objArray =new Object[2][4];
		objArray[0][0]="vikash";
		objArray[0][1]="vikash projecr tyss";
		objArray[0][2]="compleated";
		objArray[0][3]="200";
		
		
		objArray[1][0]="kumar";
		objArray[1][1]="kumar project";
		objArray[1][2]="completed";
		objArray[1][3]="400";
		
		
		return objArray;
		
		
		
       
		
	
	}

}
