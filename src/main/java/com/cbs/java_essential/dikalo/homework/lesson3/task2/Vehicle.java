package com.cbs.java_essential.dikalo.homework.lesson3.task2;

public class Vehicle {
    int cost;
    int speed;
    int year;
}

class Plane extends Vehicle {
    int height;
    int numberOfPassengers;

    Plane(int height, int numberOfPassengers) {
        this.cost = 1000000;
        this.speed = 10000;
        this.year = 2012;
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane.\nCost: " + cost + "\nSpeed: " + speed + "\nYear: " + year + "\nNumber of passengers: "
                + numberOfPassengers  + "\nHeight: " + height;
    }
}

class Car extends Vehicle {
    Car() {
        this.cost = 10000;
        this.speed = 120;
        this.year = 2000;
    }

    @Override
    public String toString() {
        return "Car.\nCost = " + cost + "\nSpeed = " + speed + "\nYear = " + year;
    }
}

class Ship extends Vehicle {
    int numberOfPassengers;
    String homePort;

    Ship(int numberOfPassengers, String homePort) {
        this.cost = 100000;
        this.speed = 300;
        this.year = 2006;
        this.numberOfPassengers = numberOfPassengers;
        this.homePort = homePort;
    }

    @Override
    public String toString() {
        return "Ship.\nCost = " + cost + "\nSpeed = " + speed + "\nYear = " + year + "\nNumber of passengers = "
                + numberOfPassengers + "\nHome port = " + homePort;
    }
}