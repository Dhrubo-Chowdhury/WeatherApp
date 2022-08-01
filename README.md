# WeatherApp
1. Install openjdk 11.0 and maven.
2. put maven directory in the environment variables
3. Open terminal/git bash and type mvn spingboot:run
``` mvn springboot:run```
4. Open a new terminal and do a curl for the latitude and longitude that you are interested
```
curl -X GET "http://localhost:8080/api/weather?latitude=40.7483&longitude=-73.9856" | python -m json.tool
```
