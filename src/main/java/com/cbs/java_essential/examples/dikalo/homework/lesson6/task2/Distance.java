package com.cbs.java_essential.examples.dikalo.homework.lesson6.task2;

public class Distance {
    static double distance;

    public void print() {
    }

    static class Converter {
        public double convertMetersToKilometers(double meters) {
            return meters / 1000;
        }

        public double convertMilesToKilometers(double miles) {
            return miles * 1.6;
        }

        public double convertKilometersToMeters(double kilometers) {
            return kilometers * 1000;
        }

        public double convertKilometersToMiles(double kilometers) {
            return kilometers / 1.6;
        }
    }
}

