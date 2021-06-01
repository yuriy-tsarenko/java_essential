package com.cbs.java_essential.ruslan.homework.lesson5.task3;

import java.util.ArrayList;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework 5 task3
 * Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
 */
public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> animalList = new ArrayList<>();
        animalList.add("Monkey");
        animalList.add("Tiger");
        animalList.add("Gorilla");
        animalList.add("Bear");
        animalList.add("Chicken");
        animalList.add("Lion");
        animalList.add("Elephant");
        animalList.add("Panther");

        System.out.println("Стартовый размер списка: " + animalList.size());

        for (String pet : animalList) {
            System.out.println(pet);
        }
        animalList.remove(2); // 3 animal - Gorilla
        animalList.remove(3); // 5 animal - Chicken
        animalList.remove(4); // 7 animal - Elephant

        System.out.println("\n" + "После удаления: " + animalList.size());

        for (String pet : animalList) {
            System.out.println(pet);
        }

    }
}
