package PraticeTest.RestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class BasicChallengingAuth {
	@Test
	public void testParameter()
	{
	Response resp = given().auth().basic("ToolsQA", "TestPassword").get("http://restapi.demoqa.com/authentication/CheckForAuthentication-authentication");
	System.out.println(resp.statusCode());
	System.out.println(resp.asString());
	}

}
