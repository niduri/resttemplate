package com.sandeep.restapi.resttemplate.services;


import com.sandeep.restapi.resttemplate.domains.WeatherData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherDataService {

       RestTemplate restTemplate;

    public WeatherDataService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public WeatherData getWeatherData(){
        WeatherData weatherData = restTemplate.getForObject("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=bc180a34af68eccb41d9f40e826e9e46", WeatherData.class);

        return weatherData;
}


}
