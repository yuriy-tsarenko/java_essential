package com.cbs.java_essential.ruslan.homework.lesson1.task2;

import java.util.List;
import java.util.Scanner;

/**
 * by Ruslan
 * 2 вариант с использованием интерфейса возможно имеет право на жизнь?
 * Создать класс с именем Rectangle. В теле класса создать два поля, описывающие длины сторон double side1,
 * double side2.
 * Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
 * и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу,
 * которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
 */


public class RectangleTwo {
    private static double side1;
    private static double side2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RectangleTwo.side1 = scanner.nextInt();
        RectangleTwo.side2 = scanner.nextInt();
        Icalculator area = new Area();
        Icalculator perimetr = new Perimeter();
        List<Icalculator> icalculators
                = List.of(area, perimetr);
        icalculators.forEach(icalculator -> System.out.println(icalculator.calcAreaPerimetr()));
    }

    public static class Area implements Icalculator {

        @Override
        public String calcAreaPerimetr() {
            return "Площадь: " + RectangleTwo.side1 * RectangleTwo.side2;
        }
    }

    public static class Perimeter implements Icalculator {

        @Override
        public String calcAreaPerimetr() {
            return "Периметр: " + ((RectangleTwo.side1 + RectangleTwo.side2) * 2);
        }
    }

}
