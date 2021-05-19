package com.cbs.java_essential.ruslan.homework.lesson4.task2;

/**
 * by Ryslan svitliy.rk@gmail.com
 * Homework 4 task2
 */
public class TxtHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открыт документ в формате TXT");
    }

    @Override
    void create() {
        System.out.println("Создан документ в формате TXT");
    }

    @Override
    void change() {
        System.out.println("Изменён документ в формате TXT");
    }

    @Override
    void save() {
        System.out.println("Сохранён документ в формате TXT");

    }
}
