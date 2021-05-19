package com.cbs.java_essential.dikalo.homework.lesson2.task2;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    public Car() {
        year = 2000;
        speed = 120.0;
        weight = 3;
        colour = "Black";
    }

    public Car(int year) {
        this.year = year;
        speed = 120.0;
        weight = 3;
        colour = "Black";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        weight = 3;
        colour = "Black";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        colour = "Black";
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }
}
