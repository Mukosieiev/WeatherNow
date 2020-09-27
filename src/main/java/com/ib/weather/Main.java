/**
 * DESCRIPTION: Contains all the main information about the weather in the area.
 *
 * @param temp is the temperature measured in kelvins.
 * @param feels_like is the temperature parameter accounts for the human
 * perception of weather.
 * @param temp_min is the minimum currently observed temperature at the area
 * measured in kelvins.
 * @param temp_max is the maximum currently observed temperature at the area
 * measured in kelvins.
 * @param pressure is the atmospheric pressure on the ground level measured in
 * hPa.
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 *
 */
package com.ib.weather;

public class Main {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private double humidity;
    private double pressure;
//----------------------------------Getters----------------------------------

    public String getTemp() {
        return String.format("%.0f", (temp - 273.15));
    }

    public String getFeels_like() {
        return String.format("%.0f", (feels_like - 273.15));
    }

    public String getTemp_min() {
        return String.format("%.0f", (temp_min - 273.15));
    }

    public String getTemp_max() {
        return String.format("%.0f", (temp_max - 273.15));
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
//----------------------------------Setters----------------------------------

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

}
