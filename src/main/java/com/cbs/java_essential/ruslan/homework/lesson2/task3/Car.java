package com.cbs.java_essential.ruslan.homework.lesson2.task3;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Car {
    private Integer year;
    private Double speed;
    private Integer weight;
    private String color;

    Car() {
        this.year = 2000;
        this.speed = 100.0;
        this.weight = 4500;
        this.color = "Red";
    }

    Car(Integer year) {
        this.year = year;
        this.speed = 150.0;
        this.weight = 2500;
        this.color = "Orange";
    }

    Car(Integer year, Double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 4000;
        this.color = "Black";
    }

    Car(Integer year, Double speed, Integer weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Silver";
    }

    Car(Integer year, Double speed, Integer weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

}
