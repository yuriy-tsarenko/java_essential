package com.cbs.java_essential.ruslan.homework.lesson6.task2;
/**
 *  * By Ruslan svitliy@gmail.com
 *  * Homework 6 task2
 * Требуется: Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
 * которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
 */

public class Vehicle {
    public void print() {
        System.out.println("class Venhicle");
    }

    static class Wheel {
        void print() {
            System.out.println("class Wheel");
        }
    }

    static class Door {
        void print() {
            System.out.println("class Door");
        }
    }

}



