package com.cbs.java_essential.krauze.homework.lesson1.task1;

//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.


public class Rectangle {
    double area, perimeter;

    public Rectangle() {
    }


    public double areaCalculator(double side1, double side2) {
        this.area = (side1 * side2);
        return area;
    }


    public double perimeterCalculator(double side1, double side2) {
        this.perimeter = (side1 + side2) * 2;
        return perimeter;
    }

    public void outResult() {
        System.out.println("Rectangle area = " + area);
        System.out.println("Rectangle perimeter = " + perimeter);
    }
}