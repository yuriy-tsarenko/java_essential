package com.cbs.java_essential.ruslan.homework.lesson2.task4;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 2 task4
 * Задание 4
 * (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
 * Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 * Перегрузить конструкторы вызывая конструктор из конструктора.
 * Создать класс Main, в котором создать экземляры класса Машина с разными параметрами
 */

public class Main {
    public static void main(String[] args) {

        Car carDefault = new Car();
        Car carWithOneParameter = new Car(2005);
        Car carWithTwoParameter = new Car(2006, 200.0);
        Car carWithThreeParameter = new Car(2007, 300.0, 1000);
        Car carWithForParameter = new Car(2008, 400.0, 1200, "Violet");

        System.out.println("Год: " + carDefault.getYear() +
                "; Скорость: " + carDefault.getSpeed() +
                "; Вес : " + carDefault.getWeight() +
                "; Цвет : " + carDefault.getColor());

        System.out.println("Год: " + carWithOneParameter.getYear() +
                "; Скорость: " + carWithOneParameter.getSpeed() +
                "; Вес : " + carWithOneParameter.getWeight() +
                "; Цвет : " + carWithOneParameter.getColor());


        System.out.println("Год: " + carWithTwoParameter.getYear() +
                "; Скорость: " + carWithTwoParameter.getSpeed() +
                "; Вес : " + carWithTwoParameter.getWeight() +
                "; Цвет : " + carWithTwoParameter.getColor());

        System.out.println("Год: " + carWithThreeParameter.getYear() +
                "; Скорость: " + carWithThreeParameter.getSpeed() +
                "; Вес : " + carWithThreeParameter.getWeight() +
                "; Цвет : " + carWithThreeParameter.getColor());

        System.out.println("Год: " + carWithForParameter.getYear() +
                "; Скорость: " + carWithForParameter.getSpeed() +
                "; Вес : " + carWithForParameter.getWeight() +
                "; Цвет : " + carWithForParameter.getColor());
    }
}