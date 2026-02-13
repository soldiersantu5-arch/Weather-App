
# WeatherApp

A simple Java console application that fetches and displays current weather information for a given city using the OpenWeatherMap API.

---

## Features

- Fetches real-time weather data from OpenWeatherMap.
- Displays temperature (in Celsius), humidity, and weather description.
- Built with Java 11 and Maven.
- Uses Java HttpClient and Gson for HTTP requests and JSON parsing.

---

## Prerequisites

- Java JDK 11 or higher installed.
- Maven installed.
- An OpenWeatherMap API key. You can get one for free by signing up at [https://openweathermap.org/api](https://openweathermap.org/api).

---

## Setup

1. Clone or download this repository.

2. Open `src/main/java/com/weatherapp/service/WeatherService.java` and replace the placeholder API key:

   ```java
   private static final String API_KEY = "YOUR_API_KEY"; // Replace with your actual API key
   ```

3. Save the file.

---

## Build and Run

Open a terminal in the project root directory and run:

```bash
mvn clean compile
mvn exec:java
```

When prompted, enter the city name (e.g., `Delhi`) and press Enter.

---

## Example Output

```
Enter city name: Delhi

Weather in Delhi:
Temperature: 35.0 °C
Feels Like: 36.5 °C
Humidity: 43%
Description: few clouds
```

---

## Troubleshooting

- If you see warnings related to `sun.misc.Unsafe`, they are harmless and can be suppressed by adding JVM arguments in the `pom.xml` (see below).

- To suppress warnings, update your `pom.xml` with:

  ```xml
  <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>3.1.0</version>
      <configuration>
          <mainClass>com.weatherapp.WeatherApp</mainClass>
          <fork>true</fork>
          <jvmArgs>
              <jvmArg>--add-opens</jvmArg>
              <jvmArg>java.base/sun.misc=ALL-UNNAMED</jvmArg>
              <!-- add other --add-opens as needed -->
          </jvmArgs>
      </configuration>
  </plugin>
  ```

---

## Dependencies

- [Gson](https://github.com/google/gson) for JSON parsing.
- Java 11 HttpClient for HTTP requests.

---

## License

This project is licensed under the MIT License.

---

## Author

Santosh M C
