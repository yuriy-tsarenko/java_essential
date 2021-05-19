// (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы. Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

package com.cbs.java_essential.dikalo.homework.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Car c5 = new Car();
        Car c4 = new Car(2000);
        Car c3 = new Car(2000, 120.0);
        Car c2 = new Car(2000, 120.0, 3);
        Car c1 = new Car(2000, 120.0, 3, "Black");
    }
}
