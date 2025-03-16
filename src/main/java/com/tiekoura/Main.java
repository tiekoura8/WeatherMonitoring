package com.tiekoura;

public class Main {
    public static void main(String[] args) {
        //intit
        WeatherStationImpl weatherStation = new WeatherStationImpl(37.5, 21, 44);
        DisplayWeatherImpl1 view1 = new DisplayWeatherImpl1();
        DisplayWeatherImpl2 view2 = new DisplayWeatherImpl2();

        //biding
        weatherStation.subscribe(view1);
        weatherStation.subscribe(view2);

        weatherStation.notifyObservers();

        weatherStation.setTemperature(12);
        weatherStation.setHumidity(22);
        weatherStation.setPressure(14);

        weatherStation.unsubscribe(view1);

        weatherStation.setPressure(14);



    }
}