package com.cbs.java_essential.ruslan.homework.lesson2.task4;

import lombok.Getter;
import lombok.Setter;

/**
 * by Ruslan <svitliy.rk@gmail.com>
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

    private Integer year;
    private Double speed;
    private Integer weight;
    private String color;


    public Car() {
        this(2004);
    }

    public Car(Integer year) {
        this(year, 205.0);
    }

    public Car(Integer year, Double speed) {
        this(year, speed, 1400);
    }

    public Car(Integer year, Double speed, Integer weight) {
        this(year, speed, weight, "Violet");
    }

    public Car(Integer year, Double speed, Integer weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
