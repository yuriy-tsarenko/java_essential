package com.cbs.java_essential.ruslan.homework.lesson5.task4;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework 5 task4
 * Создать класс Main,
 * создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        ListIterator<Integer> plusIterator = list.listIterator();

        while (plusIterator.hasNext()) {
            list.set(plusIterator.nextIndex(),
                    plusIterator.nextIndex() + 2);

            System.out.println(plusIterator.next());
        }
    }
}
