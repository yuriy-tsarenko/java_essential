package com.cbs.java_essential.ruslan.homework.lesson3.task3;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task3
 */
class Plane extends Vehicle {
    private double height;
    private int count;

    Plane(double height, int count) {
        this.count = count;
        this.height = height;
    }

    @Override
    public String toString() {

        return "Год: " + year +
                "; Скорость: " + speed +
                "; Цена: " + cost +
                "; Кол-во пас.: " + count +
                "; Высота: " + height;


    }

}