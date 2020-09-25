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

	public Weather getWeather() {
		return weather.get(0);
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public double getTimezone() {
		return timezone;
	}

	public String getDate() {
		return new Date().toString();
	}

	public void setTimezone(double timezone) {
		this.timezone = timezone;
	}

	public double getVisibility() {
		return visibility / 1000;
	}

	public Wind getWind() {
		return wind;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Weather [name=" + name + ", main=" + main + "]";
	}

	public Main getMain() {
		return main;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMain(Main main) {
		this.main = main;
	}

}
