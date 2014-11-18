package com.hillis.ribbontest.weatherclient;

import feign.RequestLine;

import javax.inject.Named;

/**
 * An interface to a weather API.
 */
public interface Weather {
    @RequestLine("GET /data/2.5/weather?q={city}")
    public WeatherResult getWeather(@Named("city") String city);
}
