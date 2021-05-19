package com.cbs.java_essential.ruslan.homework.lesson2.taskadd;

import lombok.Data;

/**
 * by Ruslan svitliy.rk@gmail.com
 * HomeWork 2 taskadd
 * Дополнительное задание
 * Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
 * который должен принимать радиус и используя PI посчитать площадь круга. Создать класс Main,
 * где запустить данный метод.
 */

@Data
class MyArea {
    private static final float PI = 3.14F;
    private float radius;

    static void areaOfCicle(MyArea myArea) {
        int a2 = 2;
        double area = Math.pow(myArea.getRadius(), a2) * PI;
        System.out.printf("%.2f",area);
    }


}
