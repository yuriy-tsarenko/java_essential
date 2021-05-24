package com.cbs.java_essential.return13.homework.lesson7;

//Дополнительное задание:
//Создайте перечислительный тип (enum) Vehicles,
// содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
// содержать метод getColor(), который возвращает строку с цветом автомобиля,
// и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра,
// цветом и стоимостью автомобиля.

public enum Vehicles {
    BMW(4000, "white"), AUDI(10000, "black"), VAZ(200, "red");
    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + " price = " + price + "; color = " + this.getColor();
    }
}


class Main5 {
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.BMW;
        Vehicles vehicles1 = Vehicles.AUDI;
        Vehicles vehicles2 = Vehicles.VAZ;
        System.out.println(vehicles.BMW);
        System.out.println(vehicles.AUDI);
        System.out.println(Vehicles.VAZ);
    }
}
