package com.tiekoura;

public class DisplayWeatherImpl1 implements DisplayWeather {
    @Override
    public void update(WeatherStation station) {
        System.out.println("Update weather station");
        System.out.println("Temperature: "+ station.getTemperature());
        System.out.println("Humidity: "+station.getHumidity());
        System.out.println("Pressure: "+station.getPressure());
        System.out.println("---------------");
    }
}
