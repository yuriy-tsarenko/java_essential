package com.cbs.java_essential.rishad.homework.lesson001.task01;

import java.util.Scanner;

/*
Задание:
    Используя IDEA, создайте проект c пакетом.
    Требуется: Создать класс с именем Rectangle.
    В теле класса создать два поля,
    описывающие длины сторон double side1, double side2.
    Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator
    (double side1, double side2)
    и периметр прямоугольника – double perimeterCalculator
    (double side1, double side2). Написать программу,
    которая принимает от пользователя длины двух сторон
    прямоугольника и выводит на экран периметр и площадь.
*/

/**
 * lesson001 HW-Rectangle
 *
 * @author eziomaciavelli
 */

public class Rectangle {

    //переменные поля класса
    double side1, side2;


    //метод для вычисление площади
    public static double areaCalculator(double side1, double side2) {

        double result = side1 * side2;
        System.out.println("Площадь прямоугольника: " + result);

        return result;

    }

    //метод для вычисление периметр прямоугольника
    public static double perimeterCalculator(double side1, double side2) {

        double result = (side1 + side2) * 2;
        System.out.println("Периметр прямоугольника: " + result);

        return result;

    }
    public static void main(String[] args) {

        //считываем число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину первой стороны: ");
        double side1 = scanner.nextInt();
        System.out.print("Введите длину второй стороны: ");
        double side2 = scanner.nextInt();


        //вызов методов
        areaCalculator(side1,side2);
        perimeterCalculator(side1,side2);


    }
}
