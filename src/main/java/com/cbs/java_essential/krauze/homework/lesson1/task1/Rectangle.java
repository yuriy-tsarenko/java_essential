package com.cbs.java_essential.krauze.homework.lesson1.task1;

//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.


public class Rectangle {
    double side1, side2;

    public Rectangle(double side1, double side2) {
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    public double perimetrCalculator() {
        return (side1 + side2) * 2;
    }

    public void Result() {
        System.out.println("Rectangle area = " + areaCalculator());
        System.out.println("Rectangle perimeter = " + perimetrCalculator());
    }
}
