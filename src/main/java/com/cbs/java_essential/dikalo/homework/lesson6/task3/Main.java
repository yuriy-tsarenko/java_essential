//Создать класс Calculator, с методами для выполнения основных арифметических операций. Написать программу, которая
//выводит на экран основные арифметические операции.

package com.cbs.java_essential.dikalo.homework.lesson6.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first number");
        Calculator.FirstNumber = number.nextInt();
        System.out.println("Enter the operation \"+\", \"-\", \"*\" or \"/\"");
        String operation = number.next();
        System.out.println("Enter the second number");
        Calculator.SecondNumber = number.nextInt();
        Calculator calc = new Calculator();
        switch (operation) {
            case "+":
                System.out.println(calc.add(Calculator.FirstNumber, Calculator.SecondNumber));
                break;
            case "-":
                System.out.println(calc.subtraction(Calculator.FirstNumber, Calculator.SecondNumber));
                break;
            case "*":
                System.out.println(calc.multiply(Calculator.FirstNumber, Calculator.SecondNumber));
                break;
            case "/":
                if (Calculator.SecondNumber != 0) {
                    System.out.println(calc.divide(Calculator.FirstNumber, Calculator.SecondNumber));
                } else {
                    System.out.println("You can't divide by zero!");
                }
                break;
            default:
                System.exit(-1);
        }
    }
}

