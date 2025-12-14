package com.abhi.weatherapp.service;

import com.abhi.weatherapp.model.WeatherResponse;
import com.abhi.weatherapp.util.ApiConfig;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherService {

    public WeatherResponse getWeather(String city) throws Exception {

        String url = ApiConfig.BASE_URL +
                "?q=" + city +
                "&appid=" + ApiConfig.API_KEY +
                "&units=metric";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            Gson gson = new Gson();
            return gson.fromJson(response.body(), WeatherResponse.class);
        } else if (response.statusCode() == 404) {
            throw new Exception("City not found");
        } else if (response.statusCode() == 401) {
            throw new Exception("Invalid API key");
        } else {
            throw new Exception("API error: " + response.statusCode());
        }
    }
}
