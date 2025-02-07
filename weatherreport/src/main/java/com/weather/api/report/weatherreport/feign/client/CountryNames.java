package com.weather.api.report.weatherreport.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url="https://api.postalpincode.in/pincode/",name="COUNTRYNAME")
public interface CountryNames {

	@GetMapping("/{postalcode}")
	String getCountyName(@RequestParam(name = "postalcode",required = false)String postalCode);
}
