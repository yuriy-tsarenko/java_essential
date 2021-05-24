package com.cbs.java_essential.return13.homework.lesson2;

//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы вызывая конструктор из конструктора.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.


public class Car3 {
    int year;
    double speed;
    int weight;
    String color;

    Car3(){
        this.year=1;
        this.speed=100;
        this.weight=500;
        this.color="white";
    }

    Car3(int year){

        this();
        this.year=year;
    }

    Car3(int year, double speed){
        this(year);
        this.speed=speed;
    }
    Car3(int year, double speed, int weight){
        this(year, speed);
        this.year=year;
        this.weight=weight;
    }

    Car3(int year, double speed, int weight, String color){
        this.year=year;
        this.speed=speed;
        this.weight=weight;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Car3{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

class Main3{
    public static void main(String[] args) {
        Car3 c1=new Car3();
        Car3 c2=new Car3(2);
        Car3 c3=new Car3(4,140);
        Car3 c4=new Car3(6,170,700);
        Car3 c5=new Car3(10, 210, 900,"red");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
    }
}
