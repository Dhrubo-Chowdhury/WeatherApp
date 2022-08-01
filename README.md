# WeatherApp in Java using cmd
1. Install openjdk 11.0: https://access.redhat.com/documentation/en-us/openjdk/11/html-single/installing_and_using_openjdk_11_for_windows/index#installing_openjdk_archive
2. Install maven: https://maven.apache.org/install.html
3. Open terminal/git bash and type 
``` mvn spring-boot:run```
4. Open a new terminal and do a curl for the latitude and longitude that you are interested
```
curl -X GET "http://localhost:8080/api/weather?latitude=40.7483&longitude=-73.9856" | python -m json.tool
```
Sample output:
```
{
    "number": 6,
    "name": "Thursday",
    "startTime": "2022-08-04T06:00:00-04:00",
    "endTime": "2022-08-04T18:00:00-04:00",
    "isDaytime": true,
    "temperature": 96,
    "temperatureUnit": "F",
    "temperatureTrend": "falling",
    "windSpeed": "5 to 12 mph",
    "windDirection": "S",
    "icon": "https://api.weather.gov/icons/land/day/few?size=medium",
    "shortForecast": "Sunny",
    "detailedForecast": "Sunny. High near 96, with temperatures falling to around 92 in the afternoon."
}
```

