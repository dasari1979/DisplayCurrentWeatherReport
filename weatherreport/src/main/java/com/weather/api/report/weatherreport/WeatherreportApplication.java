package com.weather.api.report.weatherreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherreportApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherreportApplication.class, args);
	}

}
