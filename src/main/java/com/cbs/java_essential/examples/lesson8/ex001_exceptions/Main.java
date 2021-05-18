package com.cbs.java_essential.examples.lesson8.ex001_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int n = 2;

        try {
            // Попытка деления на ноль.
            a = a / (0);

            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
