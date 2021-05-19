package com.cbs.java_essential.ruslan.homework.lesson2.task2;

import lombok.Getter;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 2 task2
 * Задание 2
 * Создать класс Машина с полями год(int), цвет(String).
 * Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
 * Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */

@Getter

class Car {
    private Integer year;
    private String color;

    Car() {
    }

    Car(Integer year) {
        this.year = year;
    }

    Car(Integer year, String color) {
        this.year = year;
        this.color = color;
    }
}
