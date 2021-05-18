package com.cbs.java_essential.homework.lesson4.task2;
/**
 * by Ryslan svitliy.rk@gmail.com
 * Homework 4 task2
 * <p>
 * Создайте класс AbstractHandler.
 * В теле класса создать методы void open(), void create(), void change(), void save().
 * Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
 * Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия,
 * создания, редактирования, сохранения определенного формата документа.
 */

class XmlHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открыт документ в формате XML");
    }

    @Override
    void create() {
        System.out.println("Создан документ в формате XML");
    }

    @Override
    void change() {
        System.out.println("Изменён документ в формате XML");
    }

    @Override
    void save() {
        System.out.println("Сохранён документ в формате XML");
    }
}
