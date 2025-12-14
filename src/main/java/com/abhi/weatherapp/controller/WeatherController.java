package com.abhi.weatherapp.controller;

import com.abhi.weatherapp.model.WeatherResponse;
import com.abhi.weatherapp.service.WeatherService;
import com.abhi.weatherapp.util.ApiConfig;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherController {

    @FXML private TextField cityField;
    @FXML private Label cityLabel;
    @FXML private Label tempLabel;
    @FXML private Label feelsLabel;
    @FXML private Label humidityLabel;
    @FXML private Label windLabel;
    @FXML private Label conditionLabel;
    @FXML private ImageView iconView;
    @FXML private Label statusLabel;

    private final WeatherService service = new WeatherService();

    @FXML
    private void getWeather() {
        try {
            String city = cityField.getText();

            if (city == null || city.isBlank()) {
                statusLabel.setText("Please enter a city");
                return;
            }

            WeatherResponse data = service.getWeather(city);

            cityLabel.setText(data.name);
            tempLabel.setText("Temp: " + data.main.temp + " °C");
            feelsLabel.setText("Feels like: " + data.main.feels_like + " °C");
            humidityLabel.setText("Humidity: " + data.main.humidity + "%");
            windLabel.setText("Wind: " + data.wind.speed + " m/s");
            conditionLabel.setText(data.weather.get(0).description);

            String iconUrl =
                    String.format(ApiConfig.ICON_URL, data.weather.get(0).icon);
            iconView.setImage(new Image(iconUrl));

            statusLabel.setText("Success");

        } catch (Exception e) {
            statusLabel.setText("Error fetching weather");
            e.printStackTrace();
        }
    }
}
