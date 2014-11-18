package com.hillis.ribbontest.weatherclient;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Jackson object for main.
 */
public class Main {
    double temp;
    double pressure;
    int humidity;
    @JsonProperty("temp_min")
    double tempMin;
    @JsonProperty("temp_max")
    double tempMax;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }
}
