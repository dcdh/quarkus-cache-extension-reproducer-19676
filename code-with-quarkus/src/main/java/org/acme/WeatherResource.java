package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.greeting.extension.runtime.WeatherForecastService;

import java.time.LocalDate;

@Path("/weather")
public class WeatherResource {

    @Inject
    WeatherForecastService weatherForecastService;

    @Inject
    AppWeatherForecastService appWeatherForecastService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String weatherForecastService() {
        return weatherForecastService.getDailyForecast(LocalDate.of(2026, 1, 1), "Paris");
    }

    @GET
    @Produces
    @Path("/app")
    public String appWeatherForecastService() {
        return appWeatherForecastService.getDailyForecast(LocalDate.of(2026, 1, 1), "Paris");
    }


}
