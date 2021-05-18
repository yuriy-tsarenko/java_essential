package com.cbs.java_essential.ruslan.homework.lesson5.task2;

import java.util.ArrayList;
/**
 *  by Ruslan svitliy.rk@gmail.com
 *   Homework 5 task2
 * Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
 * Вывести список в консоль.
 */

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> animalList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            animalList.add(i, (i + 1)
                    + ". animal "
                    + "index: " + i);
        }
        for (String pet : animalList) {
            System.out.println(pet);
        }
    }
}