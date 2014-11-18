package com.hillis.ribbontest.weatherclient;

/**
 * Jackson object for openweathermap.org.
 */
public class WeatherResult {
    Coord coord;
    String name;
    Main main;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
