package com.cbs.java_essential.ruslan.homework.lesson2.task3;

import java.util.List;

/**
 * HomeWork 2 task3
 * Задание 3
 * (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
 * Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 * Перегрузить конструкторы. Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
 */
public class Main {
    public static void main(String[] args) {

        Car carDefault = new Car();
        Car carOneParameter = new Car(2006);
        Car carWithTwoParameter = new Car(1999, 180.0);
        Car carWithThreeParameter = new Car(2020, 350.0, 3800);
        Car carWithForParameter = new Car(2008, 185.0, 2600, "Black");

        List<Car> carList = List.of(carDefault, carOneParameter,
                carWithTwoParameter, carWithThreeParameter, carWithForParameter);
        carList.forEach(car -> System.out.println(car.toString()));
    }
}