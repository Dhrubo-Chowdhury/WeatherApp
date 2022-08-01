package com.example.weatherapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller{

    @GetMapping("/weather")
    public Map getWeatherData (@RequestParam String latitude, @RequestParam String longitude) {

        String firstUrl = "https://api.weather.gov/points/" + latitude + "," + longitude;
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> map;
        try{
            map = restTemplate.getForObject(firstUrl, Map.class);
        } catch(HttpClientErrorException e){
            Map<String, String> errorMap = new HashMap<>();
            errorMap.put("Error", "Data Unavailable for the requested Point");
            return errorMap;
        }
        Map<String, Object> properties = (Map<String, Object>) map.get("properties");
        String forecastString = (String) properties.get("forecast");
        RestTemplate restTemplate2 = new RestTemplate();
        Map<String, Object> map2 = restTemplate2.getForObject(forecastString, Map.class);
        Map<String, Object> properties2 = (Map<String, Object>) map2.get("properties");
        List<Map<String, Object>> periods = (List) properties2.get("periods");
        Map<String, Object> wednesdayNight = periods.get(5);
        return wednesdayNight;
    }
}
