package PraticeTest.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestGetExactData {
	@Test
	public void fetchExactData()
	{
		//Get API no parameter allowed
		Response resp = RestAssured.get("http://restcountries.eu/rest/v2/all");
		Object object = resp.jsonPath().get("currencies[0].code");
		System.out.println(object);
	}

}
