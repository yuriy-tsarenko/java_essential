//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса создать
//два поля, описывающие длины сторон double side1, double side2. Создать два метода, вычисляющие площадь прямоугольника
//– double areaCalculator (double side1, double side2) и периметр прямоугольника – double perimeterCalculator
//(double side1, double side2). Написать программу, которая принимает от пользователя длины двух сторон прямоугольника
//и выводит на экран периметр и площадь.

package com.cbs.java_essential.dikalo.homework.lesson1.rectangle;

public class Rectangle {
    public static double side1;
    public static double side2;

    public static void main(String[] args) {
        side1 = 4;
        side2 = 5;
        System.out.println(areaCalculator(side1, side2));
        System.out.println(perimeterCalculator(side1, side2));
    }

    public static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public static double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
