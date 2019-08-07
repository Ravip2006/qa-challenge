package com.testcode.demo;

import static io.restassured.RestAssured.*;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

public class WeatherChannelService extends BaseClassTest {
	private static final String key = "1f81a25440fe4e65a6e7bccb7951cb26";
	private static final String key1 = "1f81a25440fe4e65a6e7bccb7951cb25";
	private static final String error = "API key not valid, or not yet activated.";
	// GetPropertyValues PropVal = new GetPropertyValues();

	@DataProvider(name = "zipcode")
	public String[][] createZipCodeTestData() {

		return new String[][] { { "2067", "Chatswood West", "AU" }, { "2000", "Rosario", "AR" },
				{ "2066", "Lane Cove North", "AU" } };
	}

	// Test to validate the city and country based on zipcode
	@Test(dataProvider = "zipcode")
	public void test_WeatherChannelServicePostalCode(String postal_code, String location, String country) {

		given().pathParam("code", postal_code).pathParam("api_key", key).when()
				.get("/current?postal_code={code}&key={api_key}").then().assertThat().statusCode(200).and()
				.body("data[0].city_name", equalTo(location)).and().body("data[0].country_code", equalTo(country)).and()
				.body("count", equalTo(1));
	}

	@DataProvider(name = "LatLon")
	public String[][] latLonTestData() {

		return new String[][] { { "01", "78", "Viligili", "MV" }

		};
	}

	// Test to validate the location and country based on the lattitude and
	// longitude
	@Test(dataProvider = "LatLon")
	public void test_WeatherChannelServiceLatLong(String lat, String lon, String location, String country)
			throws IOException {

		given().pathParam("lat", lat).pathParam("lon", lon).pathParam("api_key", key).when()
				.get("/current?lat={lat}&lon={lon}&key={api_key}").then().assertThat().statusCode(200).and()
				.body("data[0].city_name", equalTo(location)).and().body("data[0].country_code", equalTo(country));

	}

	@DataProvider(name = "InvalidAPIKey")
	public String[][] inValidAPIKeyTestData() {

		return new String[][] { { "01", "78" } };
	}

	// Test to validate the response with invalid ApiKey
	@Test(dataProvider = "InvalidAPIKey")
	public void test_WeatherChannelServiceLatLongInCorrectAPIKey(String lat, String lon) throws IOException {

		given().pathParam("lat", lat).pathParam("lon", lon).pathParam("api_key", key1).when()
				.get("/current?lat={lat}&lon={lon}&key={api_key}").then().assertThat().statusCode(403).and()
				.body("error", equalTo(error));

	}

}
