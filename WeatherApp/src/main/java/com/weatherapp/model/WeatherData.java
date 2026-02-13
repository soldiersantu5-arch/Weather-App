package com.weatherapp.model;

public class WeatherData {
    private String cityName;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private String description;

    // Constructor, getters, and setters

    public WeatherData(String cityName, double temperature, double feelsLike, int humidity, String description) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.description = description;
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }
}