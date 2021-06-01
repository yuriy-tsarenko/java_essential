package com.cbs.java_essential.ruslan.homework.lesson10.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework10 task2
 * Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра
 * аналогично экземпляру класса List. Минимально требуемый интерфейс взаимодействия с экземпляром,
 * должен включать метод добавления элемента, индексатор для получения значения элемента по указанному индексу
 * и свойство только для чтения для получения общего количества элементов.
  */

public class MyList<T> {

    private List<T> list = new ArrayList<T>();

    public List<T> getList() {
        return list;
    }

    private void addMethod(T argument) {
        list.add(argument);
    }

    private int indexByMethod(T argument) {
        return list.indexOf(argument);
    }

    private int accounted() {
        return list.size();
    }

    public static void main(String[] args) {

        MyList<String> instance1 = new MyList<>();
        instance1.addMethod("Yes");
        instance1.addMethod("No");

        System.out.println(instance1.getList());
        System.out.println("Index: " + instance1.indexByMethod("Yes"));
        System.out.println("Count: " + instance1.accounted());

        MyList<Integer> instance2 = new MyList<>();
        instance2.addMethod(123);
        instance2.addMethod(456);
        instance2.addMethod(789);

        System.out.println(instance2.getList());
        System.out.println("Index: " + instance2.indexByMethod(456));
        System.out.println("Count: " + instance2.accounted());


    }


}

