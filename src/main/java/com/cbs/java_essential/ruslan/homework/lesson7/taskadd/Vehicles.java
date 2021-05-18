package com.cbs.java_essential.ruslan.homework.lesson7.taskadd;

/**
 * By Ruslan svitliy.rk@gmail.com
 * Homework 7 taskadd
 * Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное
 * значение (стоимость автомобиля), содержать метод getColor(), который возвращает строку с цветом автомобиля,
 * и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра,
 * цветом и стоимостью автомобиля.
 */

public enum Vehicles {

    SUBARU(1500, "SILVER"),
    AUDI(1200, "RED"),
    VOLVO(1800, "GREEN"),
    MERSEDES(2000, "BLUE"),
    FORD(1000, "YELOW");

    private int cost;
    private String color;


    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }


    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return this.name() +
                "  price: " + cost + " * color: "
                + this.getColor();
    }
}


class Main {
    public static void main(String[] args) {

        for (Vehicles vehicles : Vehicles.values()) {
            System.out.println(vehicles);
        }
    }
}