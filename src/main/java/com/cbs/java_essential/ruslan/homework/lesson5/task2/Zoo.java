package com.cbs.java_essential.ruslan.homework.lesson5.task2;

import java.util.ArrayList;

/**
 * Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
 * Вывести список в консоль.
 */
public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> petList = new ArrayList<>();


        for (int i = 0; i < 8; i++) {
            petList.add(i, (i + 1) + ". animal " + "index: " + i );
        }


        for (var pet : petList) {
            System.out.println(pet);
        }
    }
}