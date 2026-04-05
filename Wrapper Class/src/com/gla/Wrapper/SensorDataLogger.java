package com.gla.Wrapper;

import java.util.ArrayList;

public class SensorDataLogger {

    public static void addTemperature(ArrayList<Double> list, double value) {
        list.add(value);
    }

    public static void addTemperature(ArrayList<Double> list, Double value) {
        list.add(value);
    }

    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();

        double temp1 = 25.5;
        Double temp2 = 30.2;

        addTemperature(temperatures, temp1);
        addTemperature(temperatures, temp2);

        for (Double temp : temperatures) {
            double value = temp;
            System.out.println("Temperature: " + value);
        }
    }
}
