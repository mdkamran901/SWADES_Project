package com.swades.master.testCases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swades.endpoints.SwadesAPIsEndPoints;
import com.swades.tokenAuthentication.GenerateToken;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GET_master_rl {
	static GenerateToken tg = new GenerateToken();
	static String token = tg.getAccessToken();

	@Test
	public static void GET_Master_rl() {

		Response response =

				given().header("Authorization", "Bearer " + token).contentType(ContentType.JSON)
				.pathParam("stationId","138")
						.log().all().get(SwadesAPIsEndPoints.GET_master_rl);

		response.prettyPrint();
		System.out.println("status code is \n" + response.statusCode());
		// System.out.println(response.getBody().asString())
		//String bodyAsString = response.getBody().asString();
		//Assert.assertEquals(bodyAsString.contains(""), true
		///* Actual Value */, "Response body contains ");

		System.out.println("Response Time is \n" +response.getTime());
		System.out.println(response.getStatusLine());
		Assert.assertEquals(response.statusCode(), 200);
		// System.out.println(response.getHeaders());
		// extentTest.log(LogStatus.PASS, "Verify that get report_dashboard API");
		String responseCode = response.statusCode() + "";
		if (responseCode.equals("200")) {
			Assert.assertEquals(responseCode, "200");

		} else if (responseCode.equals("404")) {
			Assert.assertEquals(responseCode, "404");

		}

	}
}
