package com.cbs.java_essential.ruslan.homework.lesson2.task4;

import lombok.Getter;
import lombok.Setter;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 2 task4
 * Задание 4
 * (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
 * Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 * Перегрузить конструкторы вызывая конструктор из конструктора.
 * Создать класс Main, в котором создать экземляры класса Машина с разными параметрами
 */

@Setter
@Getter

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;


   public Car() {
        this.year = 0;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "zero";
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


   public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}
