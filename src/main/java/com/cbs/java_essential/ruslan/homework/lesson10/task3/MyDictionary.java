package com.cbs.java_essential.ruslan.homework.lesson10.task3;

import java.util.HashMap;
import java.util.Map;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework10 task3
 Создайте класс MyDictionary. Реализуйте в простейшем приближении возможность использования его экземпляра.
 Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления пар элементов,
 индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения
 общего количества пар элементов.
 */


class MyDictionary<K,V> {

    private Map<K,V> keytValueHashMap = new HashMap<>();

    private Map<K,V> getDictionary() {
        return keytValueHashMap;
    }

    private void addMethod(K key, V value) {
        keytValueHashMap.put(key, value);
    }

    private V indexByMethod(K key) {
        return keytValueHashMap.get(key);

    }

    private int accounted() {
        return keytValueHashMap.size();
    }

    public static void main(String[] args) {

        MyDictionary<String, Integer> instance = new MyDictionary<>();
        instance.addMethod("Alla", 124);
        instance.addMethod("Hi", 5689);

        System.out.println(instance.getDictionary());
        System.out.println("Index: " + instance.indexByMethod("Hi"));
        System.out.println("Count:  " + instance.accounted());
    }
}
