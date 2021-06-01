//Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle. В теле класса создайте поля:
// координаты и параметры средств передвижения (цена, скорость, год выпуска). Создайте 3 производных класса
// Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров. Для класса Ship –
// количество пассажиров и порт приписки. Написать программу, которая выводит на экран информацию о каждом средстве
// передвижения.

package com.cbs.java_essential.dikalo.homework.lesson3.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane(10000, 228);
        Vehicle ship = new Ship(100, "Odessa");

        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }
}
