package com.cbs.java_essential.examples.lesson7.anonymous.ex004_anonymous_classes;

/**
 * Анонимные классы.
 * Локальные переменные доступны в блоке объявления анонимного класса.
 */
interface Interface {
    void method();
}

public class Main {
    public static String message = "message";

    public static void main(String[] args) {
        // Локальные переменные доступны в блоке объявления анонимного класса
        int n = 100;

        // Объявление анонимного (внутреннего) класса
        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
                String message2 = message;
                publicField = n;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
