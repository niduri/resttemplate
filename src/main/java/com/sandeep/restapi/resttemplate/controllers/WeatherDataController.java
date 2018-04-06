package com.sandeep.restapi.resttemplate.controllers;

import com.sandeep.restapi.resttemplate.domains.WeatherData;
import com.sandeep.restapi.resttemplate.services.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherDataController {
    @Autowired
    private WeatherDataService weatherDataService;


    @RequestMapping("/api/weather")
    public WeatherData getWeatherData(){
        return weatherDataService.getWeatherData();
    }
}