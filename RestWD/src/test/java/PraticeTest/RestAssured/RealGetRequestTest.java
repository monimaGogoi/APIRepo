package PraticeTest.RestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class RealGetRequestTest {
	@Test
	public void testParameter()
	{
	Response resp = given().param("id", "40").get("https://jsonplaceholder.typicode.com/posts");
	System.out.println(resp);
	}

}
