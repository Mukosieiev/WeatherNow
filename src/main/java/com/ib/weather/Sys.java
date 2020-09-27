/**
 * DESCRIPTION: Contains all the system parameters.
 *
 * @param country is the country of the requested location(USA, China, India, etc.).
 * @param sunrise is the sunrise time of the current location measured in UNIX
 * time.
 * @param sunset is the sunset time of the current location measured in UNIX
 * time.
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 *
 */
package com.ib.weather;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Sys {

    private String country;
    private long sunrise;
    private long sunset;
//----------------------------------Getters----------------------------------

    public String getCountry() {
        return country;
    }

    public String getSunrise() {
        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date(sunrise * 1000));
        return date;
    }

    public String getSunset() {
        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date(sunset * 1000));
        return date;
    }
//----------------------------------Setters----------------------------------

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }
}
