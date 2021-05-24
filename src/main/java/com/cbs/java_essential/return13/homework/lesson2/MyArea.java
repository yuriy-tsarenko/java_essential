package com.cbs.java_essential.return13.homework.lesson2;

//Дополнительное задание
//Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
//который должен принимать радиус и используя PI посчитать площадь круга.
// Создать класс Main, где запустить данный метод.

public class MyArea {
    public static final double PI = 3.14;

    public static void areaCircle(double r) {
        double resultS = PI * r * r;
        System.out.println(resultS);
    }
}

class Main4 {
    public static void main(String[] args) {
        MyArea.areaCircle(5);
    }
}
