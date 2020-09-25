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
