package com.cbs.java_essential.return13.homework.lesson3;

//Задание 3
//        Используя IntelliJ IDEA, создайте проект.
//        Требуется: Создать класс Vehicle.
//        В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
//        Создайте 3 производных класса Plane, Саг и Ship.
//        Для класса Plane должна быть определена высота и количество пассажиров.
//        Для класса Ship – количество пассажиров и порт приписки. Написать программу,
//        которая выводит на экран информацию о каждом средстве передвижения.
public class Vehicle {
    private double speed;
    private int year;
    private double price;

    Vehicle(double speed, int year, double price) {
        this.price = price;
        this.year = year;
        this.speed = speed;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

class Plane extends Vehicle {
    private double height;
    private int passenger;

    Plane(double height, int passenger) {
        super(1000, 1, 50000);
        this.height = height;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passenger=" + passenger +
                '}';
    }
}

class Car extends Vehicle {
    Car() {
        super(200, 0, 1000);
    }

}

class Ship extends Vehicle {
    private int passenger;
    private String steamerHomePort;

    Ship(int passenger, String steamerHomePort) {
        super(100, 1, 100000);
        this.passenger = passenger;
        this.steamerHomePort = steamerHomePort;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passenger=" + passenger +
                ", steamerHomePort='" + steamerHomePort + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v = new Plane(1800, 200);
        Vehicle s = new Ship(400, "Port Morzbi");
        Vehicle c = new Car();
        System.out.println(v);
        System.out.println(s);
        System.out.println(c);


    }
}
