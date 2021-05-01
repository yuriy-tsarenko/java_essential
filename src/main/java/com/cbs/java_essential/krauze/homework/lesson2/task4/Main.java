package com.cbs.java_essential.krauze.homework.lesson2.task4;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car(2006);
        Car car3=new Car(2010,160);
        Car car4=new Car(2016,180,1700);
        Car car5=new Car(2019, 190, 1350,"Blue");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }
}
