package com.cbs.java_essential.ruslan.homework.lesson7.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное значение
 * (возраст животного), и содержать перегруженный метод toString(), который должен возвращать название экземпляра
 * и возраст животного.
 */


public enum Animals {

    MONKEY(8),
    TIGER(7),
    GORILLA(6),
    BEAR(5),
    LION(4),
    PANTHER(3);

    private int year;

    Animals(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name() +
                "   years:  " + year;
    }

}

class Main {
    public static void main(String[] args) {

        for (Animals animals : Animals.values()) {
            System.out.println(animals.toString());
        }


    }
}