package com.cbs.java_essential.return13.homework.lesson2;

//Создать класс Машина с полями год(int), цвет(String).
// Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
// Создать класс Main в котором создать экземпляры вызывая разные конструкторы.


public class Car {

    int year;                                                             //Обьявляем переменные
    String color;


    Car() {
    }                                                              //конструктор по умолчанию


    Car(int year) {                                                      //конструктор с одним параметром
        this.year = year;
    }

    Car(int year, String color) {                                       // Конструктор с двумя параметрами
        this.year = year;
        this.color = color;

    }

}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(5);
        Car car2 = new Car(10, "White");

        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println("--------------------------------------------------");
        System.out.println(car1.year + " " + car1.color);
        System.out.println("---------------------------------------------------");
        System.out.println(car2.year + " " + car2.color);
    }
}
