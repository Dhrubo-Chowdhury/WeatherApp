# WeatherApp in Java
1. Install openjdk 11.0: https://access.redhat.com/documentation/en-us/openjdk/11/html-single/installing_and_using_openjdk_11_for_windows/index#installing_openjdk_archive
2. Install maven: https://maven.apache.org/install.html
3. Start the server: Open terminal/git bash and type 
``` mvn spring-boot:run```
4. Send a GET request: Open a new terminal and do a curl for the latitude and longitude that you are interested
```
curl -X GET "http://localhost:8080/api/weather?latitude=40.7483&longitude=-73.9856" | python -m json.tool
```
Sample output:
```
{
    "number": 5,
    "name": "Wednesday Night",
    "startTime": "2022-08-03T18:00:00-05:00",
    "endTime": "2022-08-04T06:00:00-05:00",
    "isDaytime": false,
    "temperature": 77,
    "temperatureUnit": "F",
    "temperatureTrend": null,
    "windSpeed": "0 to 5 mph",
    "windDirection": "S",
    "icon": "https://api.weather.gov/icons/land/night/tsra_hi,80/tsra_hi,40?size=medium",
    "shortForecast": "Showers And Thunderstorms",
    "detailedForecast": "Showers and thunderstorms. Mostly cloudy, with a low around 77. South wind 0 to 5 mph. Chance of precipitation is 80%."
}
```

