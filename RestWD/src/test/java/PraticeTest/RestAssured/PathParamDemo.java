package PraticeTest.RestAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class PathParamDemo {
	@Test
	public void testParameter()
	{
	Response resp = given().pathParam("x", "api").pathParam("y","v1").get("https://dummy.restapiexample.com/{x}/{y}/employees");
	System.out.println(resp);
	}

}
