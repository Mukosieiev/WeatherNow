/**
 * DESCRIPTION: Main function of the program, that starts the whole application.
 *
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 */
package com.ib.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

}
