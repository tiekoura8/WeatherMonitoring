package com.tiekoura;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStation {
    private double temperature;
    private double humidity;
    private double pressure;
    private final List<DisplayWeather> displayWeathers = new ArrayList<>();


    public WeatherStationImpl(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void subscribe(DisplayWeather observer) {
        displayWeathers.add(observer);
    }

    @Override
    public void unsubscribe(DisplayWeather observer) {
        displayWeathers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (DisplayWeather observer : displayWeathers) {
            observer.update(this);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {

        this.temperature = temperature;
        notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {

        this.pressure = pressure;
        notifyObservers();
    }
}
