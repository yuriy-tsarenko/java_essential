package com.cbs.java_essential.krauze.homework.lesson1.task1;
//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter rectangle side 2: ");
        double side2 = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(side1, side2);

        rectangle.perimetrCalculator();
        rectangle.areaCalculator();
        rectangle.Result();
    }

}
