package com.cbs.java_essential.krauze.homework.lesson2.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2015);
        Car car3 = new Car(2016, "Green");
        Car car4 = new Car(2007, "Gray", 165);
        Car car5 = new Car(2019, "White", 190, 1875);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

    }
}
