package com.tiekoura;

public interface WeatherStation {
    void subscribe(DisplayWeather observer);
    void unsubscribe(DisplayWeather observer);
    void notifyObservers();

    double getTemperature();
    double getHumidity();
    double getPressure();
}
