//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы вызывая конструктор из конструктора.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

package com.cbs.java_essential.dikalo.homework.lesson2.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2000);
        Car car3 = new Car(2000, 120.0);
        Car car4 = new Car(2000, 120.0, 3);
        Car car5 = new Car(2000, 120.0, 3, "Black");


    }
}
