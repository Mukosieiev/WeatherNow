/**
 * DESCRIPTION: The core of the program that controls the information flow.
 * Calls all the corresponding information about the weather.
 * Sends the defined information to weather.jsp.
 *
 * @param visibilty is the visibility in the area measured in meters.
 * @param timezone is the timezone of the current location measured in shifted
 * seconds from UTC.
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 *
 */
package com.ib.weather;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class WeatherData {

    private String name;
    @Autowired
    private Main main;
    private double visibility;
    private Wind wind;
    private double timezone;
    private Sys sys;
    private List<Weather> weather;
//----------------------------------Utility----------------------------------

    @Override
    public String toString() {
        return "Weather [name=" + name + ", main=" + main + "]";
    }

//----------------------------------Getters----------------------------------
    public Weather getWeather() {
        return weather.get(0);
    }

    public Sys getSys() {
        return sys;
    }

    public double getTimezone() {
        return timezone;
    }

    public String getDate() {
        return new Date().toString();
    }

    public double getVisibility() {
        return visibility / 1000;
    }

    public Wind getWind() {
        return wind;
    }

    public String getName() {
        return name;
    }

    public Main getMain() {
        return main;
    }
//----------------------------------Setters----------------------------------

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public void setTimezone(double timezone) {
        this.timezone = timezone;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMain(Main main) {
        this.main = main;
    }

}
