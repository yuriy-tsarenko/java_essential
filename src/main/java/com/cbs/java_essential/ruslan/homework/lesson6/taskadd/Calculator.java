package com.cbs.java_essential.ruslan.homework.lesson6.taskadd;

/**
 * By Ruslan svitliy@gmail.com
 * Homework 6 taskadd
 * Дополнительное задание:
 * Создать класс Calculator, с методами для выполнения основных арифметических операций. Написать программу,
 * которая выводит на экран основные арифметические операции.
 */
class Calculator {

    double adding(double oneNumber, double twoNumber) {
        return oneNumber + twoNumber;
    }

    double division(double oneNumber, double twoNumber) {
        return oneNumber / twoNumber;
    }

    double multiplication(double oneNumber, double twoNumber) {
        return oneNumber * twoNumber;
    }

    double subtraction(double oneNumber, double twoNumber) {
        return oneNumber - twoNumber;
    }

    double degree(double oneNumber, double twoNumber) {
        return Math.pow(oneNumber, twoNumber);
    }

    double corner(double oneNumber) {
        return Math.sqrt(oneNumber);
    }


}