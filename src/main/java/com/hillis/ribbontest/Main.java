package com.hillis.ribbontest;

import com.hillis.ribbontest.weatherclient.Weather;
import com.hillis.ribbontest.weatherclient.WeatherResult;
import feign.Feign;
import feign.jackson.JacksonDecoder;

/**
 * A test for ribbon.
 */
public class Main {
    public static void main(String[] args) {
        String city = "Kitchener,on";
        Weather weather = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(Weather.class, "http://api.openweathermap.org");
        WeatherResult result = weather.getWeather(city);
        System.out.println(String.format("Weather for %s (%f, %f)", result.getName(), result.getCoord().getLat(), result.getCoord().getLon()));
        System.out.println(String.format("Humidity: %d%%", result.getMain().getHumidity()));
        System.out.println(String.format("Air pressure: %fkPa", result.getMain().getPressure()));
        System.out.println(String.format("Temp: %.2f C", result.getMain().getTemp() - 273.15));
        System.out.println(String.format("Min Temp: %.2f C", result.getMain().getTempMin() - 273.15));
        System.out.println(String.format("Max Temp: %.2f C", result.getMain().getTempMax() - 273.15));

    }
}

