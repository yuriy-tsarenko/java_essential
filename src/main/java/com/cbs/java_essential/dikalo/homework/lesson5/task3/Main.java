//Используя Intelij IDEA создать проект, пакет. Создать класс Main, создать список целых чисел и используя ListIterator
//пройтись по списку и увеличить значения на 1;

package com.cbs.java_essential.dikalo.homework.lesson5.task3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        ListIterator<Integer> iterator = integers.listIterator();

        while (iterator.hasNext()) {
            integers.set(iterator.nextIndex(), iterator.nextIndex() + 1);
            System.out.println(iterator.next());
        }
    }
}
