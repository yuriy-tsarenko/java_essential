package com.cbs.java_essential.dikalo.homework.lesson2.task2;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    public Car() {
        this(2000,120.0,3,"Black");
    }

    public Car(int year) {
        this(year, 120.0,3,"Black");
    }

    public Car(int year, double speed) {
        this(year, speed,3,"Black");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight,"Black");
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
