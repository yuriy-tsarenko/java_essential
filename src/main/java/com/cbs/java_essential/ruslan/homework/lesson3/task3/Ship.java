package com.cbs.java_essential.ruslan.homework.lesson3.task3;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 3 task3
 * Требуется: Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств передвижения
 * (цена, скорость, год выпуска). Создайте 3 производных класса Plane, Саг и Ship. Для класса Plane должна быть
 * определена высота и количество пассажиров. Для класса Ship – количество пассажиров и порт приписки.
 * Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
 */

class Ship extends Vehicle {
    private int count;
    private String port;

    Ship(String port, int count) {
        this.count = count;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Год: "
                + year + "; Скорость: "
                + speed + "; Цена: "
                + cost + "; Кол-во пас.: "
                + count + "; Порт: " + port;


    }
}
