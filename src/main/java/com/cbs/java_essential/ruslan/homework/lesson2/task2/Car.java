package com.cbs.java_essential.ruslan.homework.lesson2.task2;

import lombok.Getter;
import lombok.Setter;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 2 task2
 * Задание 2
 * Создать класс Машина с полями год(int), цвет(String).
 * Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
 * Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */
@Setter
@Getter

public class Car {
    private Integer year;
    private String color;

    public Car() {
    }

    public Car(Integer year) {
        this.year = year;
    }

    public Car(Integer year, String color) {
        this.year = year;
        this.color = color;
    }
}
