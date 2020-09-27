/**
 * DESCRIPTION: Grabs the data from the OpenWeatherAPI (JSON) and maps it to
 * appropriate classes. The ApiKey has to be obtained from the official website
 * and then manually typed in. To type manually, check the
 * Sources -> src/main/resources -> default package -> application.properties.
 * For more info about the API calls, please visit the following link:
 *
 * @link https://openweathermap.org/current
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 *
 */
package com.ib.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Value("${api.key}")
    private String ApiKey;

    @RequestMapping("/")
    public String getHome() {
        return "index.jsp";
    }

    /**
     * Calls the API, using the name of the city. Returns the object to
     * manipulate with.
     *
     * @param cityname is the name of the city to get the data from.
     * @returns the ModelAndWiev object with data from the call.
     */
    @RequestMapping("/getTemp")
    @ResponseBody
    public ModelAndView getCityTemperature(String cityname) {
        ModelAndView MV = new ModelAndView("weather.jsp");
        RestTemplate restTemplate = new RestTemplate();
        WeatherData w = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=" + cityname + "&appid=" + ApiKey, WeatherData.class);
        MV.addObject(w);
        return MV;
    }

}
