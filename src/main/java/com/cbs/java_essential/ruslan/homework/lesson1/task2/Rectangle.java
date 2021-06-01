package com.cbs.java_essential.ruslan.homework.lesson1.task2;

import java.util.Scanner;

/**
 * by Ruslan
 * HomeWork 1 task2
 * Создать класс с именем Rectangle. В теле класса создать два поля, описывающие длины сторон double side1,
 * double side2.
 * Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
 * и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу,
 * которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
 */



public class Rectangle {


    private static double side1;
    private static double side2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        double area = areaCalculator(side1, side2);
        double perimetr = perimeterCalculator(side1, side2);
        System.out.println("Площадь: " + area + "  Периметр: " + perimetr);

    }

    private static double areaCalculator(double side1, double side2) {
        return Rectangle.side1 * Rectangle.side2;
    }

    private static double perimeterCalculator(double side1, double side2) {
        return ((Rectangle.side1 + Rectangle.side2) * 2);
    }
}


