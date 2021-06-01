package com.cbs.java_essential.ruslan.homework.lesson10.addtask;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework10 add task
 * Создайте класс MyClass, содержащий статический фабричный метод - T factoryMethod(), который будет порождать
 * экземпляры типа, указанного в качестве параметра типа (указателя места заполнения типом – Т).
 */
public class MyClass {

    private <T> void factoryMethod(T argument) {

        System.out.println(argument);
    }

    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.factoryMethod("Hi everone!");
        instance.factoryMethod(2021);


    }

}

