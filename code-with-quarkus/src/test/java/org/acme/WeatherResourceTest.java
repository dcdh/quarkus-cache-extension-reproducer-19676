package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class WeatherResourceTest {
    @Test
    void testWeatherEndpoint() {
        given()
          .when().get("/weather")
          .then()
             .statusCode(200)
             .body(is("THURSDAY will be cloudy in Paris"));
    }

    @Test
    void testAppWeatherEndpoint() {
        given()
                .when().get("/weather/app")
                .then()
                .statusCode(200)
                .body(is("THURSDAY will be cloudy in Paris"));
    }

}