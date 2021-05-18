package com.cbs.java_essential.ruslan.homework.lesson6.task3;

import java.util.Scanner;

/**
 *  * By Ruslan svitliy@gmail.com
 *  * Homework 6 task3
 * Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте статический класс
 * Converter с методами, которые будут конвертировать расстояние в разные единицы измерения (к примеру, из метров
 * в километры, из километров в мили, и так далее).
 */
public class Distance {

    double distance;

    public void print() {
    }

    static class Converter {

        double inchByCentimetr(double inch) {
            return inch * 2.5;
        }
        double kilometerByMile(double kilometer) {
            return kilometer / 8;
        }
        double metertBykilometr(double meter) {
            return meter / 100;
        }

    }

    public static void main(String[] args) {

        Distance.Converter converter = new Converter();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите дюймы, километры, метры через пробел: ");
        double distance = Double.parseDouble(myScanner.next());
        System.out.println("сантиметров: "
                + converter.inchByCentimetr(distance) + "\nмиль: "
                + converter.kilometerByMile(distance) + "\nкилометров: "
                + converter.metertBykilometr(distance));
    }
}

