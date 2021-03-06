package com.cbs.java_essential.examples.lesson3.ex003_constructors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;
    public double baseNumber2;

    //     Конструктор по умолчанию.
    public BaseClass() {
    }

    // Пользовательский конструктор.
    public BaseClass(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public BaseClass(double baseNumber) {
        this.baseNumber2 = baseNumber;
    }
}
