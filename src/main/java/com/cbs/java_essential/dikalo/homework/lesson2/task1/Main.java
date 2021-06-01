//Создать класс Машина с полями год(int), цвет(String).
//Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

package com.cbs.java_essential.dikalo.homework.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myNewCar = new Car(2004);
        Car myNewerCar = new Car("Black");
        Car myNewestCar = new Car(2015, "White");
    }
}
