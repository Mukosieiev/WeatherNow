/**
 * DESCRIPTION: Contains all the information about the wind in the area.
 *
 * @param speed is measured in miles/hour.
 * @param degree shows the wind direction in degrees.
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 *
 */
package com.ib.weather;

public class Wind {

    private double speed;
    private double deg;
//----------------------------------Getters----------------------------------

    public double getSpeed() {
        return speed;
    }

    public double getDeg() {
        return deg;
    }
//----------------------------------Setters----------------------------------

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

}
