package com.cbs.java_essential.return13.homework.lesson5;

import java.util.ArrayList;

//Задание 2
// Используя Intelij IDEA создать проект, пакет. Создать класс Zoo.
// В классе создать список, в который записать 8 животных через метод add(index, element).
// Вывести список в консоль.

//Задание 3
//Используя Intelij IDEA создать проект, пакет.
// Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль

class Zoo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add(0, "Соплезубый Тигр");
        arrayList.add(1, "Белка");
        arrayList.add(2, "//дикая собака Динго");
        arrayList.add(3, "Зубр");
        arrayList.add(4, "//Скунс");
        arrayList.add(5, "Апосум");
        arrayList.add(6, "//Лемур");
        arrayList.add(7, "Жираф");
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList.size());
        System.out.println(arrayList);


    }


}
