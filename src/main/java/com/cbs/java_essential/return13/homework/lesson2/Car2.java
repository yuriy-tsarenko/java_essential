package com.cbs.java_essential.return13.homework.lesson2;

//Задание 3
// (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
// Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы. Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

public class Car2 {
    int year;
    double speed;
    String color;
    double weight;

    @Override
    public String toString() {
        return "Car2{" +
                "year=" + year +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    Car2() {
    }

    Car2(int year) {
        this.year = year;
    }

    Car2(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    Car2(int year, double speed, String color) {
        this.year = year;
        this.speed = speed;
        this.color = color;
    }

    Car2(int year, double speed, String color, double weight) {
        this.year = year;
        this.speed = speed;
        this.color = color;
        this.weight = weight;
    }

}

class Main2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        Car2 car21 = new Car2(20);
        Car2 car22 = new Car2(1, 200);
        Car2 car23 = new Car2(2, 220, "Black");
        Car2 car24 = new Car2(3, 180, "yellow", 460);
        System.out.println(car2.toString());
        System.out.println(car21.toString());
        System.out.println(car22.toString());
        System.out.println(car23.toString());
        System.out.println(car24.toString());

    }


}
