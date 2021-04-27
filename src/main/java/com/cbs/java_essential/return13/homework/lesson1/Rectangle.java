package com.cbs.java_essential.return13.homework.lesson1;


//     Задание 2
// Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.

import java.util.Scanner;

public class Rectangle {
    public double areaCalculator(double side1, double side2) {
        double resultS = side1 * side2;
        return resultS;
    }

    public double perimeterCalculator(double side1, double side2) {
        double resultP = (side1 + side2) * 2;
        return resultP;
    }
}

class Main extends Rectangle {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону А прямоугольника");
        double a = scanner.nextDouble();
        System.out.println("Введите стороноу В прямоугольника");
        double b = scanner.nextDouble();
        System.out.println("Площадь треугольника равна= " + main.areaCalculator(a, b));
        System.out.println("Периметр прямоугольника равен" + main.perimeterCalculator(a, b));


    }

}
