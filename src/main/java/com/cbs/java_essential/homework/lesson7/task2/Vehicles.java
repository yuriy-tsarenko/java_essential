//Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное значение
//(стоимость автомобиля), содержать метод getColor(), который возвращает строку с цветом автомобиля, и содержать
//перегруженный метод toString(), который должен возвращать строку с названием экземпляра, цветом и стоимостью
//автомобиля.

package com.cbs.java_essential.homework.lesson7.task2;

public enum Vehicles {
    Audi(20000, "red"), Mercedes(25000, "green"), Peugeot(30000, "blue");

    private final int price;
    private final String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + ": price - " + this.price;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Vehicles.Audi.toString());
        System.out.println(Vehicles.Mercedes.toString());
        System.out.println(Vehicles.Peugeot.toString());
    }
}