package com.cbs.java_essential.ruslan.homework.lesson5.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework 5 task4
 * Создать класс Main,
 * создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer + " ");
        }
        System.out.println();
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            listIterator.set(integer);
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next() + 1;
            System.out.print(element + " ");

        }
    }
}

