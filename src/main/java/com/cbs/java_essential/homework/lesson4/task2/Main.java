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
public class Main {
    public static void main(String[] args) {


        DOCHandler docHandler = new DOCHandler();
        System.out.println(" Работа с форматом DOC");
        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();

        TXTHandler txtHandler = new TXTHandler();
        System.out.println(" Работа с форматом TXT");
        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();

        XMLHandler xmlHandler = new XMLHandler();
        System.out.println(" Работа с форматом XML: ");
        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();

    }
}