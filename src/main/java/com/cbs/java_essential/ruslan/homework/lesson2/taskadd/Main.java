package com.cbs.java_essential.ruslan.homework.lesson2.taskadd;

import java.util.Scanner;

/**
 * HomeWork 2 taskadd
 * Дополнительное задание
 * Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
 * который должен принимать радиус и используя PI посчитать площадь круга. Создать класс Main,
 * где запустить данный метод.
 */

public class Main {

    public static void main(String[] args) {
       MyArea myArea = new MyArea();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите радиус: ");
   myArea.setRadius(Float.parseFloat(myScanner.next()));

      MyArea.areaOfCicle(myArea);
    }
}

