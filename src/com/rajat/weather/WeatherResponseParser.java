package com.rajat.weather;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author rajatsrivastava
 **/
public class WeatherResponseParser {
    public void parseAndPrint(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);
        if (jsonObject.getInt("cod") == 200) {
            System.out.println("Weather forecast for city:");
            JSONArray forecasts = jsonObject.getJSONArray("list");
            for (int i = 0; i < forecasts.length(); i++) {
                JSONObject forecast = forecasts.getJSONObject(i);
                long timestamp = forecast.getLong("dt");
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(timestamp * 1000));
                double temperature = forecast.getJSONObject("main").getDouble("temp");
                int humidity = forecast.getJSONObject("main").getInt("humidity");
                String description = forecast.getJSONArray("weather").getJSONObject(0).getString("description");
                System.out.println("Date: " + date+ " Temperature: "+ temperature + "C" + " Humidity: "+ humidity +"% " + " description: " + description);
            }

        } else {
            System.out.println("Request contains error !");
        }
    }
}
