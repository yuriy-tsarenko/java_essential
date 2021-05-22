package com.cbs.java_essential.ruslan.homework.lesson9.task4;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework9 task4
 *  Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
 * Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
 */

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Sony", 1500, "A12345678");
        Device monitor = new Monitor("Sony", 3000, "ZZZZZZYYYYY",
                1960, 1280);

        System.out.println(device);
        System.out.println(monitor);

        System.out.println(device.equals(monitor));
        System.out.println(monitor.hashCode());
    }
}
