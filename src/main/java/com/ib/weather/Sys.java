package com.ib.weather;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Sys {
	private String country;
	private long sunrise;
	private long sunset;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}
}
