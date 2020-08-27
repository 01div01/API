package com.SoftSuave.BustelSpotTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api {
	@Test
	public void bustleSpotApiTest()
	{
		RestAssured.baseURI = "http://api.bustle-spot.com/api";
		RequestSpecification request = RestAssured.given();
		request.headers("content-type","application/JSON");
		String json = "{\"email\":\"ind1div@gmail.com\",\"password\":\"25111994\"}";
		request.body(json);
		Response response = request.post("/auth/signin");
		System.out.println(response.prettyPrint());
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		JsonPath path = response.jsonPath();
		String status = path.get("status");
		System.out.println(status);
		Assert.assertEquals(200, statusCode);
		Assert.assertEquals("success", status);
		System.out.println("Token " + path.get("data.token"));
	}

}
