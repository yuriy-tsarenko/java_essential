package com.cbs.java_essential.dikalo.homework.lesson2.task1;

public class Car {

    int year;
    String colour;


    public Car() {
        year = 2000;
        colour = "Blue";
    }

    public Car(int year) {
        this.year = year;
        colour = "Yellow";
    }

    public Car(String colour) {
        year = 2008;
        this.colour = colour;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }
}
