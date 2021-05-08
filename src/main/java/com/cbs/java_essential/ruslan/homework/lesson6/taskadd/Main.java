package com.cbs.java_essential.ruslan.homework.lesson6.taskadd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double oneNumber = Double.parseDouble(myScanner.next());
        double twoNumber = Double.parseDouble(myScanner.next());
        double adding = calc.adding(oneNumber, twoNumber);
        double subtraction = calc.subtraction(oneNumber, twoNumber);
        double multiplication = calc.multiplication(oneNumber, twoNumber);
        double division = calc.division(oneNumber, twoNumber);
        double degree = calc.degree(oneNumber, twoNumber);
        double corner = calc.corner(oneNumber);
        System.out.println("Операции калькулятора: \n"
                + "Сложение: " + adding + "\n"
                + "Вычитание: " + subtraction + "\n"
                + "Умножение: " + multiplication + "\n"
                + "Деление: " + division + "\n"
                + "Степень числа: " + degree + "\n"
                + "Корень: " + corner + "\n"
                + "Операции над числами выполнены!"
        );
    }
}