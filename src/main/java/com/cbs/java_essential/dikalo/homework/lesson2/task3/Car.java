package com.cbs.java_essential.dikalo.homework.lesson2.task3;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    public Car() {
        this.year = 2000;
        this.speed = 120.0;
        this.weight = 3;
        this.colour = "Black";
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String colour) {
        this(year, speed, weight);
        this.colour = colour;
    }
}