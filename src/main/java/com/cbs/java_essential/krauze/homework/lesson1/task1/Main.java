package com.cbs.java_essential.krauze.homework.lesson1.task1;
//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter rectangle width: ");
        double side1 = in.nextDouble();
        System.out.println("Enter rectangle height: ");
        double side2 = in.nextDouble();

        rec.perimeterCalculator(side1, side2);
        rec.areaCalculator(side1, side2);
        rec.outResult();
    }
}