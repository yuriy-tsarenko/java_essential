//Создать класс Машина с полями год(int), цвет(String).
//Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

package com.cbs.java_essential.krauze.homework.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2010);
        Car car3 = new Car("Black");
        Car car4 = new Car(2015, "Red");
    }
}
