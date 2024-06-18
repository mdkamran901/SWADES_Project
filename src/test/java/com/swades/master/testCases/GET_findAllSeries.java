package com.swades.master.testCases;

import static io.restassured.RestAssured.given;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swades.endpoints.SwadesAPIsEndPoints;
import com.swades.tokenAuthentication.GenerateToken;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GET_findAllSeries {
	static GenerateToken tg = new GenerateToken();
	static String token = tg.getAccessToken();
	public static Logger logger;

	@Test
	public static void get_findAllSeries() {
		 logger = LogManager.getLogger("SWADES API Automation Test");
		 logger.info("get_findAllSeries Test Cases is executed.");
		 
		Response response =
				given().header("Authorization", "Bearer " + token).contentType(ContentType.JSON)
						.log().all().get(SwadesAPIsEndPoints.GET_findAllSeries);

		response.prettyPrint();
		System.out.println("status code is \n" + response.statusCode());
		// System.out.println(response.getBody().asString())
		String bodyAsString = response.getBody().asString();
		Assert.assertEquals(bodyAsString.contains("stationId"), true
		/* Actual Value */, "Response body contains ");

		System.out.println("Response Time is \n" +response.getTime());
		System.out.println(response.getStatusLine());
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println(response.getHeaders());
		String responseCode = response.statusCode() + "";
		if (responseCode.equals("200")) {
			Assert.assertEquals(responseCode, "200");

		} else if (responseCode.equals("404")) {
			Assert.assertEquals(responseCode, "404");

		}

	}

}
