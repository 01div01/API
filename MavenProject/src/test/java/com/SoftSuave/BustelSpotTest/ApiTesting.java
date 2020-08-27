package com.SoftSuave.BustelSpotTest;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class ApiTesting 
{
	static String token;
	/**************************************************** HOME PAGE *********************************************************/
	@BeforeClass
	public void login()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		
		
		String response=given().log().all().header("content-type","application/JSON").body(ApiPayLoad.loginPayLoad()).when().post(GetResources.loginResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
		JsonPath js=new JsonPath(response);
		token=js.getString("data.token");
		System.out.println(token);
	}
	@Test(priority=2)
	public void forgetPassword()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.forgetPasswordPayLoad()).when().post(GetResources.forgetPasswordResources()).then().assertThat().statusCode(200).body("message", equalTo("Mail has been sent to ind1div@gmail.com")).log().all().extract().response().asString();
		
	}
	@Test(priority=2)
	public void signup()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.signupPagePayLoad()).when().post(GetResources.signUpResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	/************************************************Organization*******************************************************/
	@Test(priority=2)
	public void addOrganisation()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.organisatioPayLoad()).headers("Authorization","Bearer "+token).when().post(GetResources.organisationResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void editOrganisation()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.organisatioEditPayLoad()).headers("Authorization","Bearer"+token).when().post(GetResources.organisationEditResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	/***************************************************ActivityPage********************************************************/
	@Test(priority=2)
	public void selectTheDetailsInActivityPage()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.activityPageDetailsPayLoad()).auth().oauth2(token).when().post(GetResources.viewActivityPageResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test(priority=2)
	public void viewTheDetailsInActivityPage()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.viewActivityPageDetailsPayLoad()).auth().oauth2(token).when().post(GetResources.viewActivityPageResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void getNextDate()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.getNextDatePayLoad()).auth().oauth2(token).when().post(GetResources.getNextDateResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void viewScreenShoots()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.getScreenShootsPayLoad()).auth().oauth2(token).when().post(GetResources.getScreenShootsResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void getAppActivity()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.getappActivityPayLoad()).auth().oauth2(token).when().post(GetResources.getappActivityResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	/*************************************************ProjectPage**************************************************************/
	@Test
	public void getUserList()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.getUserListPayLoad()).auth().oauth2(token).when().post(GetResources.getUserListResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void addProject()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.addProjectPayLoad()).auth().oauth2(token).when().post(GetResources.addProjectResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void addDuplicateProject()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.addDupliacatePayLoad()).auth().oauth2(token).when().post(GetResources.addDupliacateResources()).then().assertThat().statusCode(400).log().all().extract().response().asString();
	}
	@Test
	public void getProject()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.getProjectPayLoad()).auth().oauth2(token).when().post(GetResources.getProjectResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void inviteMembers()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.inviteMembersPayLoad()).auth().oauth2(token).when().post(GetResources.inviteMembersResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void searchProject()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.searchProjectPayLoad()).auth().oauth2(token).when().post(GetResources.searchProjectResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	/******************************************************************task********************************************************************/
	@Test
	public void addTask()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.addTaskPayLoad()).auth().oauth2(token).when().post(GetResources.addTaskResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void editTask()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.editTaskPayLoad()).auth().oauth2(token).when().post(GetResources.editTaskResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	@Test
	public void deleteTask()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.deleteTaskPayLoad()).auth().oauth2(token).when().post(GetResources.deleteTaskResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
	/********************************************************************Members**************************************************************/
	@Test
	public void inviteMembersFromMembers()
	{
		RestAssured.baseURI="http://api.bustle-spot.com";
		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.inviteMembersFromMembersPayLoad()).auth().oauth2(token).when().post(GetResources.inviteMembersFromMembersResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
	}
//	@Test
//	public void deleteMembers()
//	{
//		RestAssured.baseURI="http://api.bustle-spot.com";
//		given().log().all().header("content-type","application/JSON").body(ApiPayLoad.deleteTaskPayLoad()).auth().oauth2(token).when().post(GetResources.deleteTaskResources()).then().assertThat().statusCode(200).log().all().extract().response().asString();
//	}
}
