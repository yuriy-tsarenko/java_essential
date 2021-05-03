package com.cbs.java_essential.homework.lesson4.task2;
/**
 * by Ryslan svitliy.rk@gmail.com
 * Homework 4 task2
 */
public class DOCHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открыт документ в формате DOC");

    }

    @Override
    void create() {
        System.out.println("Создан документ в формате DOC");

    }

    @Override
    void change() {
        System.out.println("Изменен документ в формате DOC");
    }

    @Override
    void save() {
        System.out.println("Сохранен документ в формате DOC");


    }
}
