package com.rajat.weather;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author rajatsrivastava
 **/
public class WeatherApp {
    public static void main(String[] args) throws IOException {
        WeatherAPI api = new WeatherAPI();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What city you want to check forecast?:");
        String city = scanner.nextLine();
        String forecaseString = api.getForecast(city);
         WeatherResponseParser parser = new WeatherResponseParser();
        parser.parseAndPrint(forecaseString);
    }
}
