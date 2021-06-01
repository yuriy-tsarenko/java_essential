//Задание 2
//Используя Intelij IDEA создать проект, пакет. Создать класс Zoo. В классе создать список, в который записать
// 8 животных через метод add(index, element). Вывести список в консоль.
//Задание 3
//Используя Intelij IDEA создать проект, пакет. Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер
//списка и вывести в консоль.

package com.cbs.java_essential.dikalo.homework.lesson5.task1and2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList zoo = new ArrayList();
        zoo.add(0, "Animal1");
        zoo.add(1, "Animal2");
        zoo.add(2, "Animal3");
        zoo.add(3, "Animal4");
        zoo.add(4, "Animal5");
        zoo.add(5, "Animal6");
        zoo.add(6, "Animal7");
        zoo.add(7, "Animal8");

        System.out.println(zoo.toString());
        System.out.println(zoo.size());

        zoo.remove(2);
        zoo.remove(3);
        zoo.remove(4);
        for (Object animal : zoo) {
            System.out.println(animal);
        }
        System.out.println(zoo.size());


    }
}
