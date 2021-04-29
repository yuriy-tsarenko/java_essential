package com.cbs.java_essential.ruslan.homework.lesson1.task2;
/**
 * by Ruslan <svitliy.rk@gmail.com>
 * 2 вариант с использованием интерфейса возможно имеет право на жизнь?
 * <p>
 * Создать класс с именем Rectangle. В теле класса создать два поля, описывающие длины сторон double side1, double side2.
 * Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
 * и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу,
 * которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
 */

import java.util.List;
import java.util.Scanner;

public class Rectangle_two {
    private static double side1;
    private static double side2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle_two.side1 = scanner.nextInt();
        Rectangle_two.side2 = scanner.nextInt();
        Icalculator area = new Area();
        Icalculator perimetr = new Perimeter();
        List<Icalculator> icalculators
                = List.of(area, perimetr);
        icalculators.forEach(icalculator -> System.out.println(icalculator.calcAreaPerimetr()));
    }

    public static class Area implements Icalculator {

        @Override
        public String calcAreaPerimetr() {
            return "Площадь: " + Rectangle_two.side1 * Rectangle_two.side2;
        }
    }

    public static class Perimeter implements Icalculator {

        @Override
        public String calcAreaPerimetr() {
            return "Периметр: " + ((Rectangle_two.side1 + Rectangle_two.side2) * 2);
        }
    }

}
