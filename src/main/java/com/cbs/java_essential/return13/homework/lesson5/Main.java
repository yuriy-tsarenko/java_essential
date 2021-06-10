package com.cbs.java_essential.return13.homework.lesson5;


import java.util.ArrayList;
import java.util.ListIterator;

//Задание 4 Используя Intelij IDEA создать проект, пакет.
// Создать класс Main,
// создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(0);
        }
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {

            list.set(iterator.nextIndex(), iterator.nextIndex() + 1);
            System.out.println(iterator.next());

        }


    }
}

