//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы. Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

package com.cbs.java_essential.krauze.homework.lesson2.task3;

public class Car {
    int year;
    String color;
    double speed;
    int weight;

    public Car() {
        year = 2008;
        color = "gray";
        speed = 140;
        weight = 1250;
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year, String color, double speed) {
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public Car(int year, String color, double speed, int weight) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}