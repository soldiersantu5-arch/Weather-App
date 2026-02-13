package com.weatherapp;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.weatherapp.service.WeatherService;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        scanner.close();

        WeatherService service = new WeatherService();

        try {
            String json = service.getWeatherJson(city);
            displayWeather(json);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void displayWeather(String json) {
        Gson gson = new Gson();
        JsonObject obj = gson.fromJson(json, JsonObject.class);

        String cityName = obj.get("name").getAsString();

        JsonObject main = obj.getAsJsonObject("main");
        double temp = main.get("temp").getAsDouble();
        double feelsLike = main.get("feels_like").getAsDouble();
        int humidity = main.get("humidity").getAsInt();

        JsonArray weatherArray = obj.getAsJsonArray("weather");
        String description = "";
        if (weatherArray.size() > 0) {
            JsonObject weather = weatherArray.get(0).getAsJsonObject();
            description = weather.get("description").getAsString();
        }

        System.out.println("\nWeather in " + cityName + ":");
        System.out.println("Temperature: " + temp + " °C");
        System.out.println("Feels Like: " + feelsLike + " °C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Description: " + description);
    }
}