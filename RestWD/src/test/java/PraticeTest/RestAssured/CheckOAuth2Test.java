package PraticeTest.RestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CheckOAuth2Test {
	@Test
	public String getSecurityToken()
	{
		Response resp = get("Access API");
		//Create JSON path to capture tokenID
		String token="21345";
		return token;
	}
	
	@Test
	public void getDataFromApi()
	{
		String token = getSecurityToken();
		Response resp= given().auth().oauth2(token).get("Secured API");
		System.out.println(resp.asString());
	}

}
