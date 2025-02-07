package com.weather.api.report.weatherreport.countrycodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.weather.api.report.weatherreport.exceptions.PostalCodeNotFoundException;
import com.weather.api.report.weatherreport.exceptions.ResourceNotFoundException;
import com.weather.api.report.weatherreport.util.UserDefinedVariables;

public class CountryCodes {

	private Map<String, String> countryCodes;
	
	public CountryCodes() {
		
		this.countryCodes = new LinkedHashMap<>();
	    for (String iso : Locale.getISOCountries()) {
	        Locale l = new Locale("", iso);
	        countryCodes.put(l.getDisplayCountry(), iso);
	    }

	}
	
	public String getCountyName(String postalCodeJson) throws JSONException, IOException, ResourceNotFoundException, PostalCodeNotFoundException {
        String cuntryName = "";
        BufferedReader br = null;
        JSONObject jsonValue = null;
        try {
        JSONArray jsonArray = new JSONArray(postalCodeJson.trim());
        for (int i =0;i<jsonArray.length();i++) {
        	jsonValue = jsonArray.getJSONObject(i);
        	if(jsonArray.getJSONObject(i).isNull(UserDefinedVariables.POSTOFFICE))
            throw new PostalCodeNotFoundException("OR Not able to find PostOffice Name");
        	
        	JSONArray jsonObj = jsonArray.getJSONObject(i).getJSONArray(UserDefinedVariables.POSTOFFICE);	
        	if(jsonObj.getJSONObject(i) instanceof JSONObject) {
	        	JSONObject arrayOfJson = jsonObj.getJSONObject(i);
	        	if(arrayOfJson.get(UserDefinedVariables.COUNTRY) != null)
	        	cuntryName = arrayOfJson.get(UserDefinedVariables.COUNTRY).toString();
	        	break;
              }
         }
        }finally {
			if(br != null)
				br.close();
        	if(jsonValue == null || jsonValue.isNull(UserDefinedVariables.POSTOFFICE))
                throw new PostalCodeNotFoundException("OR Not able to find PostOffice");
		}


		return cuntryName;
	}
	public String getCountryCode(String countryName) {
		
	String country = countryCodes.entrySet().stream().filter(name->name.getKey().equalsIgnoreCase(countryName)).findAny().get().getValue();
	if(country.isEmpty() || country == null)
        throw new NullPointerException("OR Not able to find Country Code");
	return country;
		
	}
}
