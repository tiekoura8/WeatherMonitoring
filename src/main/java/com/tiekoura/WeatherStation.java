package com.tiekoura;

public interface WeatherStation {
    public void subscribe(DisplayWeather observer);
    public void unsubscribe(DisplayWeather observer);
    public void notifyObservers();

    double getTemperature();
    double getHumidity();
    double getPressure();
}
