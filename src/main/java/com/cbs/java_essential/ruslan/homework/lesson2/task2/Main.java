package com.cbs.java_essential.ruslan.homework.lesson2.task2;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 2 task2
 * Задание 2
 * Создать класс Машина с полями год(int), цвет(String).
 * Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
 * Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */


public class Main {

    public static void main(String[] args) {

        Car carDefault = new Car();
        Car carWithOneParameter = new Car(2002);
        Car carWithTwoParameter = new Car(2006,"Orange");

        System.out.println("Год: " + carWithOneParameter.getYear());
        System.out.println("Год: " + carWithTwoParameter.getYear() + "; Цвет: " + carWithTwoParameter.getColor());
    }
}
