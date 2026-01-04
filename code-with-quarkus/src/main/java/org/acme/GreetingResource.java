package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.greeting.extension.runtime.WeatherForecastService;

import java.time.LocalDate;

@Path("/hello")
public class GreetingResource {

    @Inject
    WeatherForecastService weatherForecastService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return weatherForecastService.getDailyForecast(LocalDate.of(2026, 1, 1), "Paris");
    }
}
