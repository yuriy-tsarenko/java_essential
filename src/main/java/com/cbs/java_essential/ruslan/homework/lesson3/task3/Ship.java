package com.cbs.java_essential.ruslan.homework.lesson3.task3;

/**
 * by Ruslan <svitliy.rk@gmail.com>
 * HomeWork 3 task3
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

        return
                       "Год: " + year +
                        "; Скорость: " + speed +
                        "; Цена: " + cost +
                        "; Кол-во пас.: " + count +
                        "; Порт: " + port;


    }
}
