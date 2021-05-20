package com.cbs.java_essential.ruslan.homework.lesson9.task3;

/**
 * Задание 3
 * Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
 * Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD Monitor: manufacturer =Samsung, price=120,
 * serialNumber=AB1234567CD, X=1280,Y=1024
 */



public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        System.out.println(device.toString());
        System.out.println(monitor.toString());
    }
}