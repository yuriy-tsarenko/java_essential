package com.cbs.java_essential.krauze.homework.lesson2.task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    Car(){
        this.year=2005;
        this.speed=140;
        this.weight=1600;
        this.color="Black";
    }

    Car(int year){

        this();
        this.year=year;
    }

    Car(int year, double speed){
        this(year);
        this.speed=speed;
    }
    Car(int year, double speed, int weight){
        this(year, speed);
        this.weight=weight;
    }

    Car(int year, double speed, int weight, String color){
        this(year, speed, weight);
        this.color=color;
    }

    @Override
    public String toString() {
        return "Car {" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
