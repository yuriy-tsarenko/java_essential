package com.cbs.java_essential.return13.homework.lesson2;

//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы вызывая конструктор из конструктора.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.


public class Car3 {
    int year;
    double speed;
    int weight;
    String color;

    public Car3() {
        this(2004, 205.0, 1400, "white");
    }

    public Car3(int year) {
        this(year, 205.5, 1400, "white");
    }

    public Car3(int year, Double speed) {
        this(year, speed, 1400, "white");
    }

    public Car3(int year, Double speed, int weight) {
        this(year, speed, weight, "white");
    }

    Car3(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car3{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

class Main3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(2);
        Car3 c3 = new Car3(4, 140.0);
        Car3 c4 = new Car3(6, 170.0, 700);
        Car3 c5 = new Car3(10, 210.0, 900, "red");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
    }
}
