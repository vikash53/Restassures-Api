package com.rmgYantraTests;



import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.PojoClass;
import sdet27.GenericUtility.BaseAPIClass;
import sdet27.GenericUtility.EndPoints;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateResourceAndVerifyInDtabase extends BaseAPIClass {

	@Test
	public void createResourceAndVerifyInDbTest() throws Throwable {

		//Step 1: create test data
		PojoClass pojo = new PojoClass("vikash", "taskbob" + jLib.getRandomNum(), "Completed", 40);

		//Step 2: execute post request
		Response resp = given()
				.body(pojo)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPoints.createProject);

		//Step 3: capture the project id from response
		String expData = rLib.getJSONData(resp, "projectId");
		System.out.println(expData);

		//Step 4: verify in db
		String query = "select * from project;";
		String actData = dLib.executeQueryAndGetData(query, 1, expData);
		Reporter.log(actData,true);

		Assert.assertEquals(expData, actData);
		Reporter.log("data verification succesfull", true);



	}
}


